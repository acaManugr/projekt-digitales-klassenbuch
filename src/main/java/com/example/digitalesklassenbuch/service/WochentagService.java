package com.example.digitalesklassenbuch.service;

import com.example.digitalesklassenbuch.entity.Eintrag;
import com.example.digitalesklassenbuch.entity.Wochentag;

import java.util.List;

public interface WochentagService {

    List<Wochentag> getAllWochentage();

    Wochentag saveWochentag(Wochentag wochentag);

    Wochentag getWochentagById(Long id);

    Wochentag updateWochentag(Wochentag wochentag);

    void deleteWochentagById(Long id);
}