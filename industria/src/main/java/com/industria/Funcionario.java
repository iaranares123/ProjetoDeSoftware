package com.industria;

import java.util.Date;

public class Funcionario {
    private int matricula;
    private String nome;
    private Date data;
    private float salario;
    private Projeto projeto;
    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
}
