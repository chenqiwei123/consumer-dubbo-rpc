package com.example.rpcDubbo;

import com.example.rpcDubbo.UserService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    IUserService iUserService;

    @RequestMapping("/test")
    public String ceshi(){
        return iUserService.providerService("luo");
    }


}

