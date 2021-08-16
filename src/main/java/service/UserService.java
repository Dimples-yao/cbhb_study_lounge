package service;

import pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User User);

    int deleteUserById(int id);

    int updateUser(User User);

    User queryById(int id);

    List<User> queryAllUser();
}
