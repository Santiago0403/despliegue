package com.visiontech.controller;


import com.visiontech.dto.IncidenteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import com.visiontech.entities.Incidente;
import com.visiontech.servicesinterfaces.IIncidenteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/incidentes")
public class IncidenteController {
    @Autowired
    private IIncidenteService iR;

    @GetMapping
    public List<IncidenteDTO> listar() {
        return iR.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, IncidenteDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody IncidenteDTO iDTO) {
        ModelMapper m = new ModelMapper();
        Incidente i = m.map(iDTO, Incidente.class);
        iR.insert(i);
    }

    @GetMapping("/{idIncidente}")
    public IncidenteDTO listarId(@PathVariable("idIncidente") int idIncidente) {
        ModelMapper m = new ModelMapper();
        IncidenteDTO dto = m.map(iR.listId(idIncidente), IncidenteDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody IncidenteDTO iDTO) {
        ModelMapper m = new ModelMapper();
        Incidente i = m.map(iDTO, Incidente.class);
        iR.update(i);
    }

    @DeleteMapping("/{idIncidente}")
    public void eliminar(@PathVariable("idIncidente") int idIncidente) {
        iR.delete(idIncidente);
    }

    @GetMapping("/busquedas")
    public List<IncidenteDTO> buscar(@RequestParam String t) {
        return iR.buscarPorTipo(t).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, IncidenteDTO.class);
        }).collect(Collectors.toList());
    }

}
