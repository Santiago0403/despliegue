package com.visiontech.servicesimplements;

import com.visiontech.entities.Rol;
import com.visiontech.repositories.RolRepository;
import com.visiontech.servicesinterfaces.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private RolRepository roR;

    @Override
    public List<Rol> list() {
        return roR.findAll();
    }

    @Override
    public void insert(Rol a) {
        roR.save(a);
    }

    @Override
    public Rol listId(int idRol) {
        return roR.findById(idRol).orElse(new Rol());
    }

    @Override
    public void update(Rol a) {
        roR.save(a);
    }

    @Override
    public void delete(int idRol) {
        roR.deleteById(idRol);
    }
}
