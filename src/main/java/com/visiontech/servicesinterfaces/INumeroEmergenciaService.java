package com.visiontech.servicesinterfaces;

import com.visiontech.entities.NumeroEmergencia;

import java.util.List;
import java.util.Optional;

public interface INumeroEmergenciaService {
    public List<NumeroEmergencia> list();
    public void insert(NumeroEmergencia n);
    public NumeroEmergencia listId(int idNumeroEmergencia);
    public void update(NumeroEmergencia n);
    public void delete(int idNumeroEmergencia);

}
