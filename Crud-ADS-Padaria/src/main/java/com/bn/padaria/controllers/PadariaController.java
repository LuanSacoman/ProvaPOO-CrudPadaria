package com.bn.padaria.controllers;


import com.bn.padaria.models.PadariaModel;
import com.bn.padaria.services.PadariaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/padarias")
public class PadariaController {

    @Autowired
    private PadariaServices padariaServices;

    @GetMapping
    public List<PadariaModel> findAll(){
        return  padariaServices.findAll();
    }

    @GetMapping("/{id}")
    public PadariaModel buscarPorId(@PathVariable Long id){
        return  padariaServices.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar( @PathVariable Long id){
        padariaServices.deletar(id);
    }

    @PostMapping
    public PadariaModel criarPadaria(@RequestBody PadariaModel padariaModel){
        return  padariaServices.criarPadaria(padariaModel);
    }

    @PutMapping("/{id}")
    public PadariaModel atualizar(@PathVariable Long id, @RequestBody PadariaModel padariaModel){
        return  padariaServices.atualizar(id,padariaModel);
    }
}