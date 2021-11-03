package controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;
import service.UserService;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import util.RedisUtil;

@Controller
@RequestMapping("/v1")
public class UserController {
    private RedisUtil redisUtil;

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    @ResponseBody
    public List<User> list() {
        return userService.queryAllUser();
    }

    @RequestMapping("/user")
    @ResponseBody
    public Map<String, Object> user() {
        Map<String, Object> result = new HashMap<>();
        /*result.put("username","李四");
        result.put("resetname","张三");
        result.put("infotel","13731650211");
        result.put("avatar","");*/
        result.put("t",redisUtil.get("t"));

        return result;
    }
}


