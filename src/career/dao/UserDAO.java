package career.dao;

import java.util.List;

import career.exceptions.IdException;
import career.exceptions.PageException;
import career.exceptions.UserException;
import career.model.User;

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

