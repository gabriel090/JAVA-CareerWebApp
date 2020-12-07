package main.classes.career.dao;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import main.classes.career.exceptions.IdException;
import main.classes.career.exceptions.PageException;
import main.classes.career.exceptions.UserException;
import main.classes.career.mapper.UserMapper;
import main.classes.career.model.User;
import main.classes.career.validator.DAOValidator;

@Transactional
@Service("UserDAO")
public class UserDAOImpl implements UserDAO {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DAOValidator daoValidator;

    private static final Logger logger = LogManager.getLogger("UserDAO");

    private Integer pageSize = 20;

    public User getUserById(Integer userId) throws IdException {
        daoValidator.idValidate(userId);
        logger.debug("Returning user %s.", userId);
        return userMapper.getUserById(userId);
    }

    public List<User> getAllUsersDescByDate(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning user DESC by date, page: %s.",page );
        return userMapper.getAllUsersDescByDate(page);
    }

    public List<User> getAllUsersAcsByDate(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning user ASC by date, page: %s.",page );
        return userMapper.getAllUsersAcsByDate(page);
    }

    public List<User> getAllUsersDescByFirstName(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning users DESC by first name, page: %s.",page );
        return userMapper.getAllUsersDescByFirstName(page);
    }

    public List<User> getAllUsersAcsByFirstName(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning users ASC by first name, page: %s.",page );
        return userMapper.getAllUsersAcsByFirstName(page);
    }

    public List<User> getAllUsersDescByLastName(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning users DESC by last name, page: %s.",page );
        return userMapper.getAllUsersDescByLastName(page);
    }

    public List<User> getAllUsersAcsByLastName(Integer page) throws PageException {
        daoValidator.pageValidate(page);
        page *= pageSize;
        logger.debug("Returning users ASC by last name, page: %s.",page );
        return userMapper.getAllUsersAcsByLastName(page);
    }

    public List<User> getAllUsers() {
        logger.debug("Returning ALL USERS.");
        return userMapper.getAllUsers();
    }

    public void insertUser(User user) throws UserException {
        daoValidator.userValidate(user);
        Date date = new Date();
        user.setDateCreated(date);
        logger.debug("Inserting user with id: %s", user.getUserId());
        userMapper.insertUser(user);
    }

    public void updateUser(User user) throws UserException {
        daoValidator.userValidate(user);
        logger.debug("Updating user with id: %s", user.getUserId());
        userMapper.updateUser(user);
    }

    public void removeUser(Integer userId) throws IdException {
        daoValidator.idValidate(userId);
        logger.debug("Removing user with id: %s", userId);
        userMapper.removeUser(userId);
    }

    public int getRowsCount(){
        logger.debug("Getting total number of rows in USER table");
        return userMapper.getRowsCount();
    }

	@Override
	public List<User> getAllUserAcsByLastName(Integer page) throws PageException {
		// TODO Auto-generated method stub
		return null;
	}


}
