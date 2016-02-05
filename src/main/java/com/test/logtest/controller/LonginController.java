package com.test.logtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ivan on 2/5/16.
 */
@Controller
@RequestMapping(value="/login")
public class LonginController {
    @RequestMapping(value="index")
    public String index(Model model) {
        return "login/index";
    }
}
