package com.example.digitalesklassenbuch.service;

import com.example.digitalesklassenbuch.entity.Dozent;
import com.example.digitalesklassenbuch.entity.Eintrag;

import java.util.List;

public interface DozentService {

    List<Dozent> getAllDozenten();

    Dozent saveDozent(Dozent dozent);

    Dozent getDozentById(Long id);

    Dozent updateDozent(Dozent dozent);

    void deleteDozentById(Long id);
}
