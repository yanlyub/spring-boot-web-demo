package org.yly.springbootwebdemo;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

  public String hello() {
    return "hello";
  }

}
