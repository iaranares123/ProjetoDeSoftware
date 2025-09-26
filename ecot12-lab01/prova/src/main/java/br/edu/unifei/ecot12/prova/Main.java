package br.edu.unifei.ecot12.prova;
public class Main {
    public static void main(String[] args) {
        Avaliacao a= new Avaliacao();
        a.setMatricula(2024003861);
        a.setPresenca(0.8f);
        a.setNota1(5.2f);
        a.setNota2(4.6f);
        a.setSub(7.7f);
        System.out.println("Matrícula: "+a.getMatricula());
        System.out.println("Presença: "+a.getPresenca());
        System.out.println("Nota1: "+a.getNota1());
        System.out.println("Nota2: "+a.getNota2());
        if(a.media()<a.getNotaMinima()){
            System.out.println("Subustitutiva: "+a.getSub());
        }
        System.out.println("Média: "+a.media());
        System.out.println(a.aprovado());
    }
}