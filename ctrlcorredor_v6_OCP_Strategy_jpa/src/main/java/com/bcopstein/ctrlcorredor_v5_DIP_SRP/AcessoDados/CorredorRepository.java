package com.bcopstein.ctrlcorredor_v5_DIP_SRP.AcessoDados;

import java.util.List;

import com.bcopstein.ctrlcorredor_v5_DIP_SRP.LogicaNegocios.Corredor;

import com.bcopstein.ctrlcorredor_v5_DIP_SRP.LogicaNegocios.ICorredorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CorredorRepository implements ICorredorRepository {
    private ICorredorCRUD corredorCRUD;

    @Autowired
    public CorredorRepository(ICorredorCRUD corredorCRUD) {
        this.corredorCRUD = corredorCRUD;
    }
    
    public List<Corredor> todos() {
        List<Corredor> resp = corredorCRUD.findAll();
        return resp;
    }

    public void removeTodos(){
        corredorCRUD.deleteAll();    
    }

    public boolean cadastra(Corredor corredor){
        corredorCRUD.save(corredor);
        return true;
    }
}
