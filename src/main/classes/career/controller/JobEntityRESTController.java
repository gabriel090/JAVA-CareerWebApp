package main.classes.career.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import main.classes.career.dao.JobEntryDAO;
import main.classes.career.exceptions.IdException;
import main.classes.career.model.JobEntity;

import java.util.List;


@Controller
public class JobEntityRESTController {

    @Autowired
    private JobEntryDAO jobEntryDAO;

    @RequestMapping(value = "skills/{id}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<List<JobEntity>> getAllSkills(@PathVariable Integer id) throws IdException {
        return new ResponseEntity<List<JobEntity>>(jobEntryDAO.getSkills(id), HttpStatus.OK);
    }
}
