package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @date 2019-03-31
 */
@Controller
public class HelloWorld {

    @RequestMapping(path="/hello", method= RequestMethod.GET)
    public @ResponseBody String helloWorld() {
        return "hello world!";
    }
}
