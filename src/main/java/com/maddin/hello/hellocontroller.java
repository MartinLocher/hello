package com.maddin.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    
   /*  @RequestMapping ("/m") */
   @GetMapping("/m")
    public String hello (){

      
        return ("hello maddin");
    }
}
