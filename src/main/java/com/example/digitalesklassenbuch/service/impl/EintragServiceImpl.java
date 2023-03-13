package com.example.digitalesklassenbuch.service.impl;

import com.example.digitalesklassenbuch.entity.Eintrag;
import com.example.digitalesklassenbuch.repository.EintragRepository;
import com.example.digitalesklassenbuch.service.EintragService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EintragServiceImpl implements EintragService {

    private EintragRepository eintragRepository;

    public EintragServiceImpl(EintragRepository eintragRepository) {
        super();
        this.eintragRepository = eintragRepository;
    }

    @Override
    public List<Eintrag> getAllEinträge() {
        return eintragRepository.findAll();
    }
    @Override
    public Eintrag saveEintrag(Eintrag eintrag) {
        return eintragRepository.save(eintrag);
    }

    @Override
    public Eintrag getEintragById(Long id) {
        return eintragRepository.findById(id).get();
    }

    @Override
    public Eintrag updateEintrag(Eintrag eintrag) {
        return eintragRepository.save(eintrag);
    }

    @Override
    public void deleteEintragById(Long id) {
        eintragRepository.deleteById(id);
    }
}
