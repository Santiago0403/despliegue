package com.visiontech.servicesinterfaces;

import com.visiontech.entities.Notificacion;

import java.util.List;

public interface INotifiacionService {
    public List<Notificacion> list();
    public void insert(Notificacion n);
    public Notificacion listId(int idNotificacion);
    public void update(Notificacion n);
    public void delete(int idNotificacion);
}
