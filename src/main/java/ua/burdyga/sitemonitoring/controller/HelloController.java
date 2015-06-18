package ua.burdyga.sitemonitoring.controller;

import lombok.Getter;
import lombok.Setter;
import ua.burdyga.sitemonitoring.service.HelloSpringService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@Getter
@Setter
@ManagedBean
public class HelloController {

    @ManagedProperty("#{helloSpringService}")
    private HelloSpringService helloSpringService;

    public String showHello() {
        return helloSpringService.sayHello();
    }
}
