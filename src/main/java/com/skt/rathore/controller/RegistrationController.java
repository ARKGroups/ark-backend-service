package com.skt.rathore.controller;


import com.skt.rathore.model.User;
import com.skt.rathore.model.UserInfo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @RequestMapping(method=RequestMethod.POST,
                    value="/register",
                    produces =MediaType.APPLICATION_JSON_VALUE)
    public UserInfo register(@RequestBody User user)
    {
return new UserData();
    }
}
