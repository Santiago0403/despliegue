package com.visiontech.servicesinterfaces;

import com.visiontech.entities.Incidente;

import java.util.List;

public interface IIncidenteService {
    public List<Incidente> list();
    public void insert(Incidente i);
    public Incidente listId(int idIncidente);
    public void update(Incidente i);
    public void delete(int idIncidente);
    public List<Incidente> buscarPorTipo(String tipo);
}
