package com.example.digitalesklassenbuch.service;

import com.example.digitalesklassenbuch.entity.Eintrag;

import java.util.List;

public interface EintragService {

    List<Eintrag> getAllEinträge();

    Eintrag saveEintrag(Eintrag eintrag);

    Eintrag getEintragById(Long id);

    Eintrag updateEintrag(Eintrag eintrag);

    void deleteEintragById(Long id);
}
