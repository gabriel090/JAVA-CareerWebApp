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
import org.springframework.web.servlet.ModelAndView;

import main.classes.career.dao.UserDAO;
import main.classes.career.exceptions.PageException;
import main.classes.career.model.User;

import java.util.List;


@Controller
public class UserListRESTController {

    @Autowired
    UserDAO userDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getPages() {

        return new ModelAndView("index");

    }

    @RequestMapping(value = "users/",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<User>> getAllUsers() throws PageException {
        return new ResponseEntity <List<User>> (userDAO.getAllUsersDescByDate(1), HttpStatus.OK);
    }


    //  FIRST NAME ASC

    @RequestMapping(value = "users/sort_fnasc/",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<User>> getAllUsersDefaultFNASC() throws PageException {
        return new ResponseEntity<List<User>>(userDAO.getAllUsersAcsByFirstName(1), HttpStatus.OK);
    }


    @RequestMapping(value = "users/sort_fnasc/{page}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<User>> getAllUsersFNASC(@PathVariable Integer page) throws PageException {
        return new ResponseEntity<List<User>>(userDAO.getAllUsersAcsByFirstName(page), HttpStatus.OK);
    }

    //  LAST NAME ASC

    @RequestMapping(value = "users/sort_lnasc/",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<User>> getAllUsersDefaultLNASC() throws PageException {
        return new ResponseEntity<List<User>>(userDAO.getAllUserAcsByLastName(1), HttpStatus.OK);
    }


    @RequestMapping(value = "users/sort_lnasc/{page}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<User>> getAllUsersLNASC(@PathVariable Integer page) throws PageException {
        return new ResponseEntity<List<User>>(userDAO.getAllUserAcsByLastName(page), HttpStatus.OK);
    }

    // FIRST NAME DESC

    @RequestMapping(value = "users/sort_fndesc/",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<User>> getAllUsersDefaultFNDESC() throws PageException {
        return new ResponseEntity<List<User>>(userDAO.getAllUsersDescByFirstName(1), HttpStatus.OK);
    }


    @RequestMapping(value = "users/sort_fndesc/{page}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<User>> getAllUsersFNDESC(@PathVariable Integer page) throws PageException {
        return new ResponseEntity<List<User>>(userDAO.getAllUsersDescByFirstName(page), HttpStatus.OK);
    }


    //  LAST NAME DESC

    @RequestMapping(value = "users/sort_lndesc/",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<User>> getAllUsersDefaultLNDESC() throws PageException {
        return new ResponseEntity<List<User>>(userDAO.getAllUsersDescByLastName(1), HttpStatus.OK);
    }


    @RequestMapping(value = "user/sort_lndesc/{page}",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public ResponseEntity <List<User>> getAllUsersLNDESC(@PathVariable Integer page) throws PageException {
        return new ResponseEntity<List<User>>(userDAO.getAllUsersDescByLastName(page), HttpStatus.OK);
    }





}
