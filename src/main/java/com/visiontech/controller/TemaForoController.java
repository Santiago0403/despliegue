package com.visiontech.controller;

import com.visiontech.dto.TemaForoDTO;
import com.visiontech.entities.TemaForo;
import com.visiontech.servicesinterfaces.ITemaForoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/temaforo")
public class TemaForoController {
    @Autowired
    private ITemaForoService tS;
    @GetMapping
    public List<TemaForoDTO> listar() {
        return tS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, TemaForoDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody TemaForoDTO aDTO) {
        ModelMapper m = new ModelMapper();
        TemaForo a = m.map(aDTO, TemaForo.class);
        tS.insert(a);
    }
    @GetMapping("/{idTemaForo}")
    public TemaForoDTO listarId(@PathVariable("idTemaForo") int idTemaForo) {
        ModelMapper m = new ModelMapper();
        TemaForoDTO dto = m.map(tS.listId(idTemaForo), TemaForoDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody TemaForoDTO aDTO) {
        ModelMapper m = new ModelMapper();
        TemaForo a = m.map(aDTO, TemaForo.class);
        tS.update(a);
    }
    @DeleteMapping("/{idTemaForo}")
    public void eliminar(@PathVariable("idTemaForo") int idTemaForo) {
        tS.delete(idTemaForo);
    }
}
