package com.wkf.test.controller;

import com.wkf.test.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloControler
 * @Description TODO
 * @Author wangkaifei
 * @Date 2022/8/9
 * @Version 1.0
 **/
@RestController("/jekins")
public class HelloControler {

    @RequestMapping("hello")
    public String Hello(){
        for (int i = 0;  ;i++) {
            User user = new User("name"+i,"man",18);
        }
//        return "Hello World jekins";
    }
}