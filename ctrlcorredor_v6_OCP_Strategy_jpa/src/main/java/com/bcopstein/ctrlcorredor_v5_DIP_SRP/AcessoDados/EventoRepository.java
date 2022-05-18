package com.bcopstein.ctrlcorredor_v5_DIP_SRP.AcessoDados;

import java.util.List;

import com.bcopstein.ctrlcorredor_v5_DIP_SRP.LogicaNegocios.Evento;
import com.bcopstein.ctrlcorredor_v5_DIP_SRP.LogicaNegocios.IEventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventoRepository implements IEventoRepository{
    private IEventoCRUD eventoCRUD;

    @Autowired
    public EventoRepository(IEventoCRUD eventoCRUD) {
        this.eventoCRUD = eventoCRUD;  
        }  

    public List<Evento> todos() {
        List<Evento> resp = eventoCRUD.findAll();
        return resp;
    }

    public boolean cadastra(Evento evento){
       eventoCRUD.save(evento);
       return true;
    }
}
