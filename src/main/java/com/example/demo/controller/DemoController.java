package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
        @RequestMapping("/helloworld")
        public String helloworld(Model model) {
            return "helloworld";
        }

        @RequestMapping("/helloworld/{name}")
        public String helloworld(@PathVariable("name") String name , Model model) {

            model.addAttribute("name",name);

            return "helloworld"+name;
        }
}
