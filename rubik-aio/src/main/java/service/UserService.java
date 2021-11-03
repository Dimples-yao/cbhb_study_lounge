package service;

import pojo.User;

import java.util.List;

/**
 * @author lishaoyao
 */
public interface UserService {
    int addUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

    User queryById(int id);

    List<User> queryAllUser();
}
