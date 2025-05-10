package com.visiontech.controller;

import com.visiontech.dto.RolDTO;
import com.visiontech.entities.Rol;
import com.visiontech.servicesinterfaces.IRolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private IRolService roS;
    @GetMapping
    public List<RolDTO> listar() {
        return roS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RolDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody RolDTO aDTO) {
        ModelMapper m = new ModelMapper();
        Rol a = m.map(aDTO, Rol.class);
        roS.insert(a);
    }
    @GetMapping("/{idRol}")
    public RolDTO listarId(@PathVariable("idRol") int idRol) {
        ModelMapper m = new ModelMapper();
        RolDTO dto = m.map(roS.listId(idRol), RolDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody RolDTO aDTO) {
        ModelMapper m = new ModelMapper();
        Rol a = m.map(aDTO, Rol.class);
        roS.update(a);
    }
    @DeleteMapping("/{idRol}")
    public void eliminar(@PathVariable("idRol") int idRol) {
        roS.delete(idRol);
    }
}
