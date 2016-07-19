package com.adsIn.controller;


import com.adsIn.controller.data.domain.User;
import com.adsIn.controller.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by NareshL on 18-07-2016.
 */
@RestController
@RequestMapping(value = "/user")
public class LoginController {

    @Autowired
    private UserRepository usrRepo;

    @RequestMapping(value = "/find")
    public
    ModelAndView find(){
        ModelAndView loginPage = new ModelAndView();
        loginPage.setViewName("login");
        User user = usrRepo.findByName("Naresh");
        loginPage.addObject("user", user);
        return loginPage;
    }

    @RequestMapping(value = "/post")
    public
    String post(){
        User user = new User();
        user.setName("Naresh");
        user.setPassword("Naresh-Pass");
        usrRepo.save(user);
        return "SUCCESS";
    }

    @RequestMapping(value = "/count")
    public
    int count(){
        int count = usrRepo.findUser("Naresh");
        return count;
    }

    @RequestMapping(value = "/menu")
    public ModelAndView getmenu(HttpServletRequest request){
        String basePath="classpath:/resources";
        ModelAndView menuPage=new ModelAndView("menu");
        menuPage.addObject("basePath",basePath);
        return menuPage;
    }

}
