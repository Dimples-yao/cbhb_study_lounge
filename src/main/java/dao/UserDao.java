package dao;

import pojo.User;

import java.util.List;

public interface UserDao {
    int addUser(User User);

    int deleteUserById(int id);

    int updateUser(User User);

    User queryById(int id);

    List<User> queryAllUser();
}