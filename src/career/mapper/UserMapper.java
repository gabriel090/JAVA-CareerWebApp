package career.mapper;

import java.util.List;

import career.model.User;

public interface UserMapper {

    User getUserById(Integer userId);

    List<User> getAllUsersDescByDate(Integer page);

    List<User> getAllUsersAcsByDate(Integer page);

    List<User> getAllUsersDescByFirstName(Integer page);

    List<User> getAllUsersDescByLastName(Integer page);

    List<User> getAllUsersAcsByFirstName(Integer page);

    List<User> getAllUsersAcsByLastName(Integer page);

    List<User> getAllUsers();

    int getRowsCount();

    void insertUser(User user);

    void updateUser(User user);

    void removeUser(Integer userId);

}
