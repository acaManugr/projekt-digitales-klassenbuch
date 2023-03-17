package com.example.digitalesklassenbuch.entity;

import jakarta.persistence.*;

import java.awt.*;
import java.sql.Blob;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "wochentag")
public class Wochentag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Fächer hinzufügen

    @Column(name = "vertretung")
    private String vertretung;

    @Column(name = "lernthema")
    private String lernthema;

    @Column(name = "aufgabe")
    private String aufgabe;

    @Column(name = "versäumnisse")
    private String versäumnisse;

    @Column(name = "verspätungen")
    private String verspätungen;

    @Column(name = "bemerkungen")
    private String bemerkungen;

    @Column(name = "datum")
    private LocalDate datum;

    //Unterschrift muss noch hinzugefügt werden!
    /*
    @Column(name = "unterschrift")
    private Blob unterschrift;
     */


    public Wochentag() {

    }

    public Wochentag(String vertretung, String lernthema, String aufgabe, String versäumnisse, String verspätungen,
                     String bemerkungen, LocalDate datum) {
        super();
        this.vertretung = vertretung;
        this.lernthema = lernthema;
        this.aufgabe = aufgabe;
        this.versäumnisse = versäumnisse;
        this.verspätungen = verspätungen;
        this.bemerkungen = bemerkungen;
        this.datum = datum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVertretung() {
        return vertretung;
    }

    public void setVertretung(String vertretung) {
        this.vertretung = vertretung;
    }

    public String getLernthema() {
        return lernthema;
    }

    public void setLernthema(String lernthema) {
        this.lernthema = lernthema;
    }

    public String getAufgabe() {
        return aufgabe;
    }

    public void setAufgabe(String aufgabe) {
        this.aufgabe = aufgabe;
    }

    public String getVersäumnisse() {
        return versäumnisse;
    }

    public void setVersäumnisse(String versäumnisse) {
        this.versäumnisse = versäumnisse;
    }

    public String getVerspätungen() {
        return verspätungen;
    }

    public void setVerspätungen(String verspätungen) {
        this.verspätungen = verspätungen;
    }

    public String getBemerkungen() {
        return bemerkungen;
    }

    public void setBemerkungen(String bemerkungen) {
        this.bemerkungen = bemerkungen;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    /*
    public Blob getUnterschrift() {
        return unterschrift;
    }

    public void setUnterschrift(Blob unterschrift) {
        this.unterschrift = unterschrift;
    }

     */

}