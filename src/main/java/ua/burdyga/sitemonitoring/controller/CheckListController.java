package ua.burdyga.sitemonitoring.controller;

import lombok.Getter;
import lombok.Setter;
import ua.burdyga.sitemonitoring.entity.Check;
import ua.burdyga.sitemonitoring.service.CheckService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.List;

@Getter
@Setter
@ManagedBean
public class CheckListController {

    @ManagedProperty("#{checkService}")
    private CheckService checkService;

    private List<Check> checks;

    @PostConstruct
    public void loadChecks() {
        checks = checkService.findAll();
    }
}
