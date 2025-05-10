package com.visiontech.servicesinterfaces;

import com.visiontech.entities.ContactoEmergencia;
import java.util.List;

public interface IContactoEmergenciaService {
    List<ContactoEmergencia> list();
    void insert(ContactoEmergencia c);
    ContactoEmergencia listId(int idContacto);
    void update(ContactoEmergencia c);
    void delete(int idContacto);

    List<ContactoEmergencia> buscarPorNombre(String nombre);
}
