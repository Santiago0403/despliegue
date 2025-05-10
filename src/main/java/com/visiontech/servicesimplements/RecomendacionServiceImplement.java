package com.visiontech.servicesimplements;

import com.visiontech.entities.Recomendacion;
import com.visiontech.repositories.RecomendacionRepository;
import com.visiontech.servicesinterfaces.IRecomendacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class RecomendacionServiceImplement implements IRecomendacionService {
    @Autowired
    private RecomendacionRepository rR;

    @Override
    public List<Recomendacion> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Recomendacion r) {
        rR.save(r);
    }

    @Override
    public Recomendacion listId(int idRecomendacion) {
        return rR.findById(idRecomendacion).orElse(new Recomendacion());
    }

    @Override
    public void update(Recomendacion r) {
        rR.save(r);
    }

    @Override
    public void delete(int idRecomendacion) {
        rR.deleteById(idRecomendacion);
    }

    @Override
    public List<Recomendacion> buscarPorComentario(String comentario) {
        return rR.buscarComentario(comentario);
    }
}
