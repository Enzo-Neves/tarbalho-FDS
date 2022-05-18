package com.bcopstein.ctrlcorredor_v5_DIP_SRP.AcessoDados;

import java.util.List;

import com.bcopstein.ctrlcorredor_v5_DIP_SRP.LogicaNegocios.Evento;

import org.springframework.data.repository.CrudRepository;

public interface IEventoCRUD extends CrudRepository<Evento,Integer> {
    List<Evento> findAll();
    List<Evento> findById(int id);
}
