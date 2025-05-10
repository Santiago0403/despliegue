package com.visiontech.controller;

import com.visiontech.dto.RutaDTO;
import com.visiontech.servicesinterfaces.IRutaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.visiontech.entities.Ruta;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping("/rutas")
public class RutaController {
    @Autowired
    private IRutaService rS;

    @GetMapping
    public List<RutaDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RutaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody RutaDTO rDTO) {
        ModelMapper m = new ModelMapper();
        Ruta r = m.map(rDTO, Ruta.class);
        rS.insert(r);
    }

    @GetMapping("/{idRuta}")
    public RutaDTO listarId(@PathVariable("idRuta") int idRuta) {
        ModelMapper m = new ModelMapper();
        RutaDTO dto = m.map(rS.listId(idRuta), RutaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody RutaDTO rDTO) {
        ModelMapper m = new ModelMapper();
        Ruta r = m.map(rDTO, Ruta.class);
        rS.update(r);
    }

    @DeleteMapping("/{idRuta}")
    public void eliminar(@PathVariable("idRuta") int idRuta) {
        rS.delete(idRuta);
    }

    @GetMapping("/busquedas")
    public List<RutaDTO> buscar(@RequestParam String n) {
        return rS.buscarPorNombre(n).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RutaDTO.class);
        }).collect(Collectors.toList());
    }

}