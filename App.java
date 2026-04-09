package main;

import entidade.Equipe;

public class App {

    public static void main(String[] args) {

        Equipe equipe1 = new Equipe();

        equipe1.setId(1);
        equipe1.setNome("Real Jacareí");
        equipe1.setCidade("Jacareí");

        System.out.println("Equipe cadastrada:");
        System.out.println(equipe1.getNome());
        System.out.println(equipe1.getCidade());

    }
}
