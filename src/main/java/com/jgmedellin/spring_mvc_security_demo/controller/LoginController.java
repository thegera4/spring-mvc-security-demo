package com.jgmedellin.spring_mvc_security_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

  @GetMapping("/showMyLoginPage")
  public String showMyLoginPage() {
    //return "my-login";
    return "fancy-login";
  }

  @GetMapping("/access-denied")
  public String showAccessDenied() {
    return "access-denied";
  }

}
