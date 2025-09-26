package com.industria;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private String sigla;
    private String localizacao;
    private Funcionario gerente;
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome= nome;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public Funcionario getGerente() {
        return gerente;
    }
    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
}
