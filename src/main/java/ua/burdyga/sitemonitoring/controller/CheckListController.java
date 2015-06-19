package ua.burdyga.sitemonitoring.controller;

import lombok.Getter;
import lombok.Setter;
import ua.burdyga.sitemonitoring.entity.Check;
import ua.burdyga.sitemonitoring.service.CheckService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ManagedBean
@ViewScoped
public class CheckListController implements Serializable {

    private static final long serialVersionUID = 1008538403761703813L;

    @ManagedProperty("#{checkService}")
    private CheckService checkService;

    private List<Check> checks;

    private Check check = new Check();

    @PostConstruct
    public void loadChecks() {
        checks = checkService.findAll();
    }

    public void save() {
        checkService.save(check);
        check = new Check();
    }
}
