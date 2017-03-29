package me.south10.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by south10 on 2017-03-29.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView model = new ModelAndView("home/home");
        logger.trace("1. Log a message at the TRACE level.");
        logger.debug("2. Log a message at the DEBUG level.");
        logger.info("3. Log a message at the INFO level.");
        logger.warn("4. Log a message at the WARN level.");
        logger.error("5. Log a message at the ERROR level.", new Exception("error demo ..."));
        return model;
    }
}
