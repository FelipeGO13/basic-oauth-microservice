package br.com.mastertech.user.controller;

import br.com.mastertech.user.security.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UserController {

    @GetMapping
    public User getUserInfo(@AuthenticationPrincipal User user){
        return user;
    }
}
