package com.bcopstein.ctrlcorredor_v5_DIP_SRP.LogicaNegocios;
import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Corredor {
    @Id
    private String cpf;
    private String nome;
    private int diaDn,mesDn,anoDn;
    private String genero;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="cpf")
    protected List<Evento> eventos;

    public Corredor(String cpf, String nome, int diaDn,int mesDn,int anoDn, String genero) {
        this.cpf = cpf;
        this.nome = nome;
        this.diaDn = diaDn;
        this.mesDn = mesDn;
        this.anoDn = anoDn;
        this.genero = genero;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getDiaDn() {
        return diaDn;
    }

    public int getMesDn() {
        return mesDn;
    }
    public int getAnoDn() {
        return anoDn;
    }

    public String getGenero() {
        return genero;
    }

        // Para uso da JPA
        protected Corredor(){}
}