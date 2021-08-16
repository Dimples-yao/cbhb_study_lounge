package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @date 2019-03-31
 */
@Controller
public class HelloWorld {
    @RequestMapping(path = "/hello/{id}", method = RequestMethod.GET)
    public @ResponseBody
    String helloWorld(@PathVariable("id") String id) {
        return id;
    }
}
