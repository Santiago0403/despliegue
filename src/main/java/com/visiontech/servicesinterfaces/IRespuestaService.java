package com.visiontech.servicesinterfaces;

import com.visiontech.entities.Respuesta;

import java.util.List;

public interface IRespuestaService {
    public List<Respuesta> list();
    public void insert(Respuesta r);
    public Respuesta listId(int idRespuesta);
    public void update(Respuesta r);
    public void delete(int idRespuesta);
}
