package com.visiontech.servicesimplements;

import com.visiontech.entities.NumeroEmergencia;
import com.visiontech.repositories.NumeroEmergenciaRepository;
import com.visiontech.servicesinterfaces.INumeroEmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NumeroEmergenciaServiceImplement implements INumeroEmergenciaService {
    @Autowired
    private NumeroEmergenciaRepository nR;

    @Override
    public List<NumeroEmergencia> list() {
        return nR.findAll();
    }

    @Override
    public void insert(NumeroEmergencia n) {
        nR.save(n);
    }

    @Override
    public NumeroEmergencia listId(int idNumeroEmergencia) {
        return nR.findById(idNumeroEmergencia).orElse(new NumeroEmergencia());
    }


    @Override
    public void update(NumeroEmergencia n) {
        nR.save(n);
    }

    @Override
    public void delete(int idNumeroEmergencia) {
        nR.deleteById(idNumeroEmergencia);
    }
}
