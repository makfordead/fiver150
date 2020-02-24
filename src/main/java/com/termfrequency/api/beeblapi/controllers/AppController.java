package com.termfrequency.api.beeblapi.controllers;


import com.termfrequency.api.beeblapi.entity.User;
import com.termfrequency.api.beeblapi.repository.UserRepository;
import com.termfrequency.api.beeblapi.security.CurrentUser;
import com.termfrequency.api.beeblapi.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@RestController
public class AppController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new RuntimeException("User " + userPrincipal.getId()));
    }
}
