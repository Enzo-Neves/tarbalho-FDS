package com.bcopstein.ctrlcorredor_v5_DIP_SRP.AcessoDados;

import java.util.List;

import com.bcopstein.ctrlcorredor_v5_DIP_SRP.LogicaNegocios.Corredor;

import org.springframework.data.repository.CrudRepository;

public interface ICorredorCRUD extends CrudRepository<Corredor,String> {
    List<Corredor> findAll();
    List<Corredor> findByCpf(String cpf);
}
