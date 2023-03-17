package com.example.digitalesklassenbuch.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fächer")
public class Fächer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String fach;

    public Fächer(){

    }

    public Fächer(String fach) {
        super();
        this.fach = fach;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }
}



