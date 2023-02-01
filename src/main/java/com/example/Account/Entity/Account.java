package com.example.Account.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "uuid")
    private String id;
    private String name;
    private String surname;
    private String mail;
    private String password;
    public Account() {
    }

    public Account(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

}
