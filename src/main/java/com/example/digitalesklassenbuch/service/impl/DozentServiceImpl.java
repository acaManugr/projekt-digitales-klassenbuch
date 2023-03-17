package com.example.digitalesklassenbuch.service.impl;

import com.example.digitalesklassenbuch.entity.Dozent;
import com.example.digitalesklassenbuch.entity.Eintrag;
import com.example.digitalesklassenbuch.repository.DozentRepository;
import com.example.digitalesklassenbuch.service.DozentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DozentServiceImpl implements DozentService {

    private DozentRepository dozentRepository;

    public DozentServiceImpl(DozentRepository dozentRepository) {
        super();
        this.dozentRepository = dozentRepository;
    }

    @Override
    public List<Dozent> getAllDozenten() {
        return dozentRepository.findAll();
    }
    @Override
    public Dozent saveDozent(Dozent dozent) {
        return dozentRepository.save(dozent);
    }

    @Override
    public Dozent getDozentById(Long id) {
        return dozentRepository.findById(id).get();
    }

    @Override
    public Dozent updateDozent(Dozent dozent) {
        return dozentRepository.save(dozent);
    }

    @Override
    public void deleteDozentById(Long id) {
        dozentRepository.deleteById(id);
    }
}
