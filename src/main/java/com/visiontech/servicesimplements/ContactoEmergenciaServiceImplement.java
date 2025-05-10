package com.visiontech.servicesimplements;

import com.visiontech.entities.ContactoEmergencia;
import com.visiontech.repositories.ContactoEmergenciaRepository;
import com.visiontech.servicesinterfaces.IContactoEmergenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContactoEmergenciaServiceImplement implements IContactoEmergenciaService {

    @Autowired
    private ContactoEmergenciaRepository contactoEmergenciaRepository;

    @Override
    public List<ContactoEmergencia> list() {
        return contactoEmergenciaRepository.findAll();
    }

    @Override
    public void insert(ContactoEmergencia contactoEmergencia) {
        contactoEmergenciaRepository.save(contactoEmergencia);
    }

    @Override
    public ContactoEmergencia listId(int idContacto) {
        return contactoEmergenciaRepository.findById(idContacto).orElse(null);
    }

    @Override
    public void update(ContactoEmergencia contactoEmergencia) {
        contactoEmergenciaRepository.save(contactoEmergencia);
    }

    @Override
    public void delete(int idContacto) {
        contactoEmergenciaRepository.deleteById(idContacto);
    }

    @Override
    public List<ContactoEmergencia> buscarPorNombre(String nombre) {
        return contactoEmergenciaRepository.findByNombreContainingIgnoreCase(nombre);
    }
}
