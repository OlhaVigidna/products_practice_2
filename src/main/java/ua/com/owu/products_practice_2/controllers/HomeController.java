package ua.com.owu.products_practice_2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ua.com.owu.products_practice_2.service.ProductService;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(){
        return "";
    }


}
