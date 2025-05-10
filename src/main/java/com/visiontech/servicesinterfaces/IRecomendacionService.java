package com.visiontech.servicesinterfaces;
import com.visiontech.entities.Recomendacion;

import java.util.List;

public interface IRecomendacionService {
    public List<Recomendacion> list();
    public void insert(Recomendacion r);
    public Recomendacion listId(int idRecomendacion);
    public void update(Recomendacion r);
    public void delete(int idRecomendacion);
    public List<Recomendacion> buscarPorComentario(String comentario);
}
