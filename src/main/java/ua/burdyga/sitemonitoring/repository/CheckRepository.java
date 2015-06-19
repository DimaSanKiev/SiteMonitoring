package ua.burdyga.sitemonitoring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.burdyga.sitemonitoring.entity.Check;

public interface CheckRepository extends JpaRepository<Check, Integer> {
}
