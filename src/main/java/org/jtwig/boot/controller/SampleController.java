package org.jtwig.boot.controller;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/hello/{name}")
    public String indexAction (ModelMap model, @PathVariable("name") String name) {
        model.addAttribute("name", name);
        model.addAttribute("nums", Arrays.asList(1,2,3,4));
        return "index";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
