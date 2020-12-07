package main.classes.career.dao;



import java.util.List;

import main.classes.career.exceptions.*;
import main.classes.career.model.Contacts;

public interface ContactsDAO {

    List<Contacts> getAllContacts(Integer userId) throws IdException;

    //****  EMAIL   ****//

    Contacts getEmail(Integer userId) throws IdException;

    void updateEmail(Contacts email) throws ContactsException;

    void insertEmail(Contacts email) throws ContactsException;

    void removeEmail(Integer userId) throws IdException;

    //****  ADDRESS ****//

    Contacts getAddress(Integer userId) throws IdException;

    void updateAddress(Contacts address) throws ContactsException;

    void insertAddress(Contacts address) throws ContactsException;

    void removeAddress(Integer userId) throws IdException;

    //****   PHONE  ****//

    Contacts getPhone(Integer userId) throws IdException;

    void updatePhone(Contacts phone) throws ContactsException;

    void insertPhone(Contacts phone) throws ContactsException;

    void removePhone(Integer userId) throws IdException;

   

}
