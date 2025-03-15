package com.okerry.jsonconverter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonConverterController {

    @GetMapping("/")
    String hello(Model model){
        model.addAttribute("name", "okerry");
        return "index.html";
    }
}
