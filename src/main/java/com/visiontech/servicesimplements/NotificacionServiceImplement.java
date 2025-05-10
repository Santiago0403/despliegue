package com.visiontech.servicesimplements;


import com.visiontech.entities.Notificacion;
import com.visiontech.repositories.NotificacionRepository;
import com.visiontech.servicesinterfaces.INotifiacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacionServiceImplement implements INotifiacionService {
    @Autowired
    private NotificacionRepository nR;


    @Override
    public List<Notificacion> list() {
        return nR.findAll();
    }

    @Override
    public void insert(Notificacion n) {
        nR.save(n);
    }

    @Override
    public Notificacion listId(int idNotificacion) {
        return nR.findById(idNotificacion).orElse(new Notificacion());
    }

    @Override
    public void update(Notificacion n) {
        nR.save(n);
    }

    @Override
    public void delete(int idNotificacion) {
        nR.deleteById(idNotificacion);
    }
}
