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

import main.classes.career.dao.UserDAO;
import main.classes.career.exceptions.IdException;
import main.classes.career.model.User;

@Controller
public class UserRESTController {

    @Autowired
    private UserDAO userDAO;


    @RequestMapping(value = "users/{id}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity<User> getUserById(@PathVariable Integer id) throws IdException {
        return new ResponseEntity<User>(userDAO.getUserById(id), HttpStatus.OK);
    }


}