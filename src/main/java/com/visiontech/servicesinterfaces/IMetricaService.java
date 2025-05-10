package com.visiontech.servicesinterfaces;

import com.visiontech.entities.Metrica;

import java.util.List;


public interface IMetricaService {
    public List<Metrica> list();
    public void insert(Metrica m);
    public Metrica listId(int idMetrica);
    public void update(Metrica m);
    public void delete(int idMetrica);

}
