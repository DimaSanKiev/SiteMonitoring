package ua.burdyga.sitemonitoring.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
public class Check {

    @Id
    @GeneratedValue
    private int id;

    @Size(min = 1, message = "Name cannot be empty!")
    private String name;

    @Size(min = 1, message = "URL cannot be empty!")
    @URL(message = "Invalid URL!")
    private String url;
}
