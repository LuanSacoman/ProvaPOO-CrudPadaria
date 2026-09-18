package com.bn.padaria.services;

import com.bn.padaria.models.PadariaModel;
import com.bn.padaria.repositories.PadariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PadariaServices {

   @Autowired
    private PadariaRepository padariaRepository;

   public List<PadariaModel> findAll(){
       return  padariaRepository.findAll();
   }

   public PadariaModel buscarPorId(Long id){
       return  padariaRepository.findById(id).get();
   }

   public PadariaModel criarPadaria(PadariaModel padariaModel) {
       return  padariaRepository.save( padariaModel);
   }

   //deletar
    public void deletar(Long id){
       padariaRepository.deleteById(id);
    }

    //atualizar
    public PadariaModel atualizar(Long id, PadariaModel padariaModel){
       PadariaModel loja = padariaRepository.findById(id).get();
       loja.setNome(padariaModel.getNome());
       loja.setEndereco(padariaModel.getEndereco());
       return  padariaRepository.save(loja);
    }






}