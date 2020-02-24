package com.termfrequency.api.beeblapi.controllers;

import com.termfrequency.api.beeblapi.entity.FilterRequest;
import com.termfrequency.api.beeblapi.utilities.UrlText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class FilterController {
    @Autowired
    UrlText urlText;
    @PostMapping("/filter")
    public String filterRequest(@RequestBody FilterRequest filterRequest)
    {
        if (filterRequest.getUrl()!=null)
        {
            urlText.getText(filterRequest.getUrl());
        }
        return "not Valid";
    }
    @GetMapping("/")
    public String welcome()
    {
        return ("<h1> welcome</>");
    }
}
