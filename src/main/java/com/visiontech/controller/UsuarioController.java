package com.visiontech.controller;

import com.visiontech.dto.UsuarioDTO;
import com.visiontech.entities.Usuario;
import com.visiontech.servicesinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;
    @GetMapping
    public List<UsuarioDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody UsuarioDTO aDTO) {
        ModelMapper m = new ModelMapper();
        Usuario a = m.map(aDTO, Usuario.class);
        uS.insert(a);
    }
    @GetMapping("/{idUsuario}")
    public UsuarioDTO listarId(@PathVariable("idUsuario") int idUsuario) {
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uS.listId(idUsuario), UsuarioDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody UsuarioDTO aDTO) {
        ModelMapper m = new ModelMapper();
        Usuario a = m.map(aDTO, Usuario.class);
        uS.update(a);
    }
    @DeleteMapping("/{idUsuario}")
    public void eliminar(@PathVariable("idUsuario") int idUsuario) {
        uS.delete(idUsuario);
    }

}
