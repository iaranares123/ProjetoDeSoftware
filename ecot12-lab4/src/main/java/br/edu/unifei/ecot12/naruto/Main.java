package br.edu.unifei.ecot12.naruto;

public class Main {
    public static void main(String[] args) {
        KekkeiGenkai r = new KekkeiGenkai();
        r.setNome("Rinnegan");
        Shinobi n= new Shinobi();
        n.setNome("Nagato");
        n.setApelido("Pain");
        n.setRenegado(true);
        n.getKekkeigenkai().add(r);
        System.out.println(n.getNome() + " " + n.getApelido() + " possui o Kekkei Genkai: " + n.getKekkeigenkai().get(0).getNome());
    }
}