package controller;

import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;
import service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService UserService;

    @RequestMapping("/all")
    @ResponseBody
    public List<User> list() {
        return UserService.queryAllUser();
    }
}


