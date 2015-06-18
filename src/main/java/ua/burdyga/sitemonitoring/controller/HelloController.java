package ua.burdyga.sitemonitoring.controller;

import ua.burdyga.sitemonitoring.service.HelloSpringService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "helloController")
public class HelloController {

    @ManagedProperty("#{helloSpringService}")
    private HelloSpringService helloSpringService;

    public String showHello() {
        return helloSpringService.sayHello();
    }

    public void setHelloSpringService(HelloSpringService helloSpringService) {
        this.helloSpringService = helloSpringService;
    }
}
