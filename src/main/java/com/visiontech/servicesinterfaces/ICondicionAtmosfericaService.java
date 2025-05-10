package com.visiontech.servicesinterfaces;

import com.visiontech.entities.CondicionAtmosferica;

import java.util.List;


public interface ICondicionAtmosfericaService {

    public List<CondicionAtmosferica> list();
    public void insert(CondicionAtmosferica c);
    public CondicionAtmosferica listId(int idCondicionAtmosferica);
    public void update(CondicionAtmosferica c);
    public void delete(int idCondicionAtmosferica);
}
