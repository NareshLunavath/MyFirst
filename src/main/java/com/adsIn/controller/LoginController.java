package com.adsIn.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by NareshL on 18-07-2016.
 */
@RestController
@RequestMapping(value = "/user")
public class LoginController {

    @RequestMapping(value = "/login")
    public
    ModelAndView getLogin(){
        ModelAndView loginPage = new ModelAndView();
        loginPage.setViewName("login");
        return loginPage;
    }
}
