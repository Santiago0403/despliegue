package com.visiontech.servicesinterfaces;

import com.visiontech.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<Usuario> list();
    public void insert(Usuario u);
    public Usuario listId(long idUsuario);
    public void update(Usuario u);
    public void delete(long idUsuario);
    public List<Usuario> buscarPorNombre(String nombre);
}
