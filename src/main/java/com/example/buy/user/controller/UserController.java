package com.example.buy.user.controller;

import com.example.buy.user.model.request.PostCreateUserReq;
import com.example.buy.user.model.response.PostCreateUserRes;
import com.example.buy.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public ResponseEntity create(PostCreateUserReq request){
        PostCreateUserRes response = userService.create(request);
        return ResponseEntity.ok().body(response);
    }


}
