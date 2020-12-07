package main.classes.career.dao;

import java.util.List;

import main.classes.career.exceptions.IdException;
import main.classes.career.exceptions.PageException;
import main.classes.career.exceptions.UserException;
import main.classes.career.model.User;

public interface UserDAO {

    User getUserById(Integer userId) throws IdException;

    List<User> getAllUsersDescByDate(Integer page) throws PageException;

    List<User> getAllUsersAcsByDate(Integer page) throws PageException;

    List<User> getAllUsersDescByFirstName(Integer page) throws PageException;

    List<User> getAllUsersDescByLastName(Integer page) throws PageException;

    List<User> getAllUsersAcsByFirstName(Integer page) throws PageException;

    List<User> getAllUserAcsByLastName(Integer page) throws PageException;

    List<User> getAllUsers();

    int getRowsCount();

    void insertUser(User user) throws UserException;

    void updateUser(User user) throws UserException;

    void removeUser(Integer contactsId) throws IdException;

}

