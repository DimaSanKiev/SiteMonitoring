package ua.burdyga.sitemonitoring.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloController")
public class HelloController {

    public String showHello() {
        return "hello from managed bean";
    }
}
