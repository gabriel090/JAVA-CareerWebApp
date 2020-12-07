package main.classes.career.mapper;

import java.util.List;

import main.classes.career.model.Contacts;

public interface ContactsMapper {


    List<Contacts> getAllContacts(Integer userId);

    //****  EMAIL  ****//

    Contacts getEmail(Integer userId);

    void updateEmail(Contacts email);

    void insertEmail(Contacts email);

    void removeEmail(Integer userId);

    //****  ADDRESS ****//

    Contacts getAddress(Integer userId);

    void updateAddress(Contacts address);

    void insertAddress(Contacts address);

    void removeAddress(Integer userId);

    //****  PHONE  ****//

    Contacts getPhone(Integer userId);

    void updatePhone(Contacts phone);

    void insertPhone(Contacts phone);

    void removePhone(Integer userId);




}
