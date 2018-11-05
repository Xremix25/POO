/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author xremix31
 */

public class Teste {

    public static Jogador jogador = new Jogador();
    public static int[] golos = new int[2];

    public static void main(String[] args) {
        System.out.println("** GESTOR DE NÚMERO DE GOLOS ** \n");
        System.out.println("Consultar Jogador");
        
        jogador.setNome("Ronaldo");
        jogador.setSalario(100.00);
        int[]golos = new int[34];
        golos[0]= 1;
        golos[1]= 3;
        
        jogador.setNumGolos(golos);
          jogador.getNome();
          jogador.getSalario();
          jogador.getNumGolos();
           
          System.out.println(jogador.toString());
    
    }
}
        