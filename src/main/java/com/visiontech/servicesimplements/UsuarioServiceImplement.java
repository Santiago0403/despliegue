package com.visiontech.servicesimplements;


import com.visiontech.entities.Usuario;
import com.visiontech.repositories.UsuarioRepository;
import com.visiontech.servicesinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private UsuarioRepository uR;

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Usuario a) {
        uR.save(a);
    }

    @Override
    public Usuario listId(long idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }

    @Override
    public void update(Usuario a) {
        uR.save(a);
    }


    @Override
    public void delete(long idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public List<Usuario> buscarPorNombre(String nombre) {
        return uR.buscarPorNombre(nombre);
    }
}