package ua.burdyga.sitemonitoring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.burdyga.sitemonitoring.entity.Check;
import ua.burdyga.sitemonitoring.repository.CheckRepository;

import java.util.List;

@Service
public class CheckService {

    @Autowired
    private CheckRepository checkRepository;

    public List<Check> findAll() {
        return checkRepository.findAll();
    }

    public void save(Check check) {
        checkRepository.save(check);
    }

    public void remove(Check check) {
        checkRepository.delete(check);
    }
}
