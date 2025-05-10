package com.visiontech.servicesimplements;

import com.visiontech.entities.CondicionAtmosferica;
import com.visiontech.repositories.CondicionAtmosfericaRepository;
import com.visiontech.servicesinterfaces.ICondicionAtmosfericaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CondicionAtmosfericaServiceImplement implements ICondicionAtmosfericaService {
    @Autowired
    private CondicionAtmosfericaRepository cR;

    @Override
    public List<CondicionAtmosferica> list() {return cR.findAll();}

    @Override
    public void insert(CondicionAtmosferica ca) {cR.save(ca);}

    @Override
    public CondicionAtmosferica listId(int idCondicionAtmosferica) {return cR.findById(idCondicionAtmosferica).orElse(new CondicionAtmosferica());}

    @Override
    public void update(CondicionAtmosferica ca) {cR.save(ca);}

    @Override
    public void delete(int idCondicionAtmosferica) {cR.deleteById(idCondicionAtmosferica);}
}
