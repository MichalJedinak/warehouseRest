package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project {
      // @RequestMapping("/")
      // public Sklad index(){
      //       Sklad sklad = new Sklad("", 20);
      //       return sklad;
      // }
      @RequestMapping("/index")
      public String index(){
            String s = "Moja prvá Srping Aplikácia";
            return s;
      }
 

}
