package com.example.digitalesklassenbuch.service.impl;

import com.example.digitalesklassenbuch.entity.Wochentag;
import com.example.digitalesklassenbuch.repository.WochentagRepository;
import com.example.digitalesklassenbuch.service.WochentagService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WochentagServiceImpl implements WochentagService {

    private WochentagRepository wochentagRepository;

    public WochentagServiceImpl(WochentagRepository wochentagRepository) {
        super();
        this.wochentagRepository = wochentagRepository;
    }

    @Override
    public List<Wochentag> getAllWochentage() {
        return wochentagRepository.findAll();
    }
    @Override
    public Wochentag saveWochentag(Wochentag wochentag) {
        return wochentagRepository.save(wochentag);
    }

    @Override
    public Wochentag getWochentagById(Long id) {
        return wochentagRepository.findById(id).get();
    }

    @Override
    public Wochentag updateWochentag(Wochentag wochentag) {
        return wochentagRepository.save(wochentag);
    }

    @Override
    public void deleteWochentagById(Long id) {
        wochentagRepository.deleteById(id);
    }
}
