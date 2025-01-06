package com.example.Login.controller;

import com.example.Login.model.Details;
import com.example.Login.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogController {

    @Autowired
    private LogRepository logRepository;

    @GetMapping("/login")
    public ModelAndView home()
    {
        return new ModelAndView("Login","details",new Details());
    }

    @PostMapping("/add")
    public ModelAndView det(@ModelAttribute Details s)
    {
        Details d=logRepository.save(s);
        return new ModelAndView("added","det",d);

    }

}
