package com.visiontech.servicesinterfaces;

import com.visiontech.entities.Ruta;

import java.util.List;

public interface IRutaService {
    public List<Ruta> list();
    public void insert(Ruta r);
    public Ruta listId(int idRuta);
    public void update(Ruta r);
    public void delete(int idRuta);
    public List<Ruta> buscarPorNombre(String nombre);
}