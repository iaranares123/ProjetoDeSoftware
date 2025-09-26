package br.edu.unifei.ecot12.prova;

public class Avaliacao {
    public float notaMinima=6.0f;
    private long matricula;
    private float presenca;
    private float nota1;
    private float nota2;
    private float sub;
    public boolean aprovado(){

        if(presenca >=0.75f && media()>=notaMinima){
            return true;
        } else {
            return false;

        }
    }
    public float media(){
        float nota=(nota1+nota2)/2;
        if(nota<notaMinima){
            if(nota1<nota2){
                nota=(sub+nota2)/2;
            } else {
                nota=(nota1+sub)/2;
            }
        }
        return nota;
    }


    public float getNotaMinima(){
        return notaMinima;
    }
    public void setNotaMinima(float notaMinima){
        this.notaMinima=notaMinima;
    }
    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    
    public float getNota1() {
        return nota1;
    }
    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }
    public float getNota2() {
        return nota2;
    }
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public float getSub() {
        return sub;
    }
    public void setSub(float sub) {
        this.sub = sub;
    }
    public float getPresenca() {
        return presenca;
    }
    public void setPresenca(float presenca) {
        this.presenca = presenca;
    }

}
