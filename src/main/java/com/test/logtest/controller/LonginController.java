package com.test.logtest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ivan on 2/5/16.
 */
@Controller
@RequestMapping(value="/login")
public class LonginController {
    private  Logger logger = LoggerFactory.getLogger(LonginController.class);

    @RequestMapping(value="index")
    public String index(Model model) {
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
        logger.warn("warn");
        return "login/index";
    }
}
