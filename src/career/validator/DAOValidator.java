package career.validator;

import org.springframework.stereotype.Service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import career.exceptions.*;
import career.model.Contacts;
import career.model.JobEntity;
import career.model.User;

@Service("DAOValidator")
public class DAOValidator {

    private static final Logger logger = LogManager.getLogger("DAOValidator");


    //      ID VALIDATOR

    public void idValidate(Integer id) throws IdException {
        if (id == null) {
            throw new IdException("User id can not be 'null'.");
        }
        if (id < 1) {
            throw new IdException("User id can not be less than 1.");
        }
        logger.debug("Id validation for id: %s passed.", id);
    }

    public void pageValidate(Integer page) throws PageException {
        if ((page == null) || (page < 1)) {
            throw new PageException("Page can not be 'null' or less than 1.");
        }
        logger.debug("Page validation passed.");
    }

      

    public void userValidate(User user) throws UserException {
        if (user == null) {
            throw new UserException("User to insert or update can not be 'null'.");
        }
        if ((user.getFirstName() == null || user.getFirstName().length() < 2)) {
            throw new UserException("User's new first name is 'null' or to short.");
        }
        if ((user.getLastName() == null || user.getFirstName().length() < 2)) {
            throw new UserException("User's new last name is 'null' or to short.");
        }
        logger.debug("user validation for id: %s passed.", user.getUserId());
    }

    // Contacts

 public void addressValidator(Contacts address) throws ContactsException {
        if (address == null) {
            throw new ContactsException("Address can not be 'null'.");
        }
        logger.debug("Address validation passed for id: %s", address.getContactId());
    }

    public void emailValidate(Contacts email) throws ContactsException {
        if (email == null) {
            throw new ContactsException("Email can not be 'null'.");
        }
        
        logger.debug("Email validation for id: %s, passed.", email.getContactId());

    }

    public void phoneValidate(Contacts phone) throws ContactsException {
        if (phone == null) {
            throw new ContactsException("Phone can not be 'null'.");
        }
        if ((phone.getPhoneNumber() == null)) {
            throw new ContactsException("Phone numbers can not be 'null'.");
        }
        logger.debug("Phone validation for %s,  passed.", phone.getContactId());
    }

    // public void contactsValidator(Contacts contacts) throws ContactsException {
    //     if (contacts == null) {
    //         throw new ContactsException("Contacts can not be 'null'.");
    //     }

    //     if(contacts.getEmail()==null){
    //         throw new ContactsException("Email can not be 'null'.");
    //     }
    //     if(contacts.getAddress()==null){
    //         throw new ContactsException("Address can not be 'null'.");
    //       }

    //     if(contacts.getPhoneNumber()==null){
    //         throw new ContactsException("Phone Number can not be 'null'.");
    //       }

    //     logger.debug("Contacts validation passed for id: %s", contacts.getContactId());
    // }

 //Job Entity Validation
    public void jobEntityValidate(JobEntity jobEntity) throws JobEntityException {
        if(jobEntity == null){
            throw new JobEntityException("Job Entity can not be 'null'.");
        }
        if(jobEntity.getName()==null){
            throw new JobEntityException("Job Name can not be 'null'.");
        }

         if(jobEntity.getDescription()==null){
            throw new JobEntityException("Job Description can not be 'null'.");
        }
        if(jobEntity.getType()==null){
            throw new JobEntityException("Job Type can not be 'null'.");
        }
        if(jobEntity.getExperience()==null){
            throw new JobEntityException("Years of Experience can not be 'null'.");
        }
        if(jobEntity.getEducationLevel()==null){
            throw new JobEntityException("Educational Level can not be 'null'.");
        }
   
        logger.debug("Job Entity validation for id: %s passed", jobEntity.getJobId());
    }
}
