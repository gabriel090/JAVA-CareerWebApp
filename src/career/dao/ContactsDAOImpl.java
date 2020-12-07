package career.dao;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import career.exceptions.*;
import career.mapper.ContactsMapper;
import career.model.Contacts;
import career.validator.DAOValidator;

import java.util.List;

@Transactional
@Service("ContactsDAO")
public class ContactsDAOImpl implements ContactsDAO {

    @Autowired
    private ContactsMapper contactsMapper;

    @Autowired
    DAOValidator daoValidator;

    private static final Logger logger = LogManager.getLogger("ContactsDAO");

    //      ALL CONTACTS

    public List<Contacts> getAllContacts(Integer userId) throws IdException {
        daoValidator.idValidate(userId);
        logger.debug("Returning all contacts of user with id: %s.", userId);
        return contactsMapper.getAllContacts(userId);
    }

    //      EMAIL

    public Contacts getEmail(Integer userId) throws IdException {
        daoValidator.idValidate(userId);
        logger.debug("Returning email of user with id: %s.", userId);
        return contactsMapper.getEmail(userId);
    }

    public void updateEmail(Contacts email) throws ContactsException {
        daoValidator.emailValidate(email);
        logger.debug("Updating email with id: %s.", email.getContactId());
        contactsMapper.updateEmail(email);
    }

    public void insertEmail(Contacts email) throws ContactsException {
        daoValidator.emailValidate(email);
        logger.debug("Inserting email with id: %s.", email.getContactId());
        contactsMapper.insertEmail(email);
    }

    public void removeEmail(Integer userId) throws IdException {
        daoValidator.idValidate(userId);
        logger.debug("Removing email of user: %s.", userId);
        contactsMapper.removeEmail(userId);
    }

    //      ADDRESS

    public Contacts getAddress(Integer userId) throws IdException {
        daoValidator.idValidate(userId);
        logger.debug("Returning address of user with id: %s.", userId);
        return contactsMapper.getAddress(userId);
    }

    public void updateAddress(Contacts address) throws ContactsException {
        daoValidator.addressValidator(address);
        logger.debug("Updating address with id: %s.", address.getContactId());
        contactsMapper.updateAddress(address);
    }

    public void insertAddress(Contacts address) throws ContactsException {
        daoValidator.addressValidator(address);
        logger.debug("Inserting address with id: %s.", address.getContactId());
        contactsMapper.insertAddress(address);
    }

    public void removeAddress(Integer userId) throws IdException {
        daoValidator.idValidate(userId);
        logger.debug("Removing address of user: %s.", userId);
        contactsMapper.removeAddress(userId);
    }

    //      PHONE Number

    public Contacts getPhone(Integer userId) throws IdException {
        daoValidator.idValidate(userId);
        logger.debug("Returning phone of user with id: %s.", userId);
        return contactsMapper.getPhone(userId);
    }

    public void updatePhone(Contacts phone) throws ContactsException {
        daoValidator.phoneValidate(phone);
        logger.debug("Updating phone with id: %s.", phone.getContactId());
        contactsMapper.updatePhone(phone);
    }

    public void insertPhone(Contacts phone) throws ContactsException {
        daoValidator.phoneValidate(phone);
        logger.debug("Inserting phone with id: %s.", phone.getContactId());
        contactsMapper.insertPhone(phone);
    }

    public void removePhone(Integer userId) throws IdException {
        daoValidator.idValidate(userId);
        logger.debug("Removing phone of user: %s.", userId);
        contactsMapper.removePhone(userId);
    }

   
}
