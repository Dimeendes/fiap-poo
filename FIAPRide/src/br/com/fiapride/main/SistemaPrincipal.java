package br.com.fiapride.main;

import br.com.fiapride.model.Ventilador; //importando a classe ventilador

public class SistemaPrincipal {
    
    public static void main(String[] args){ 

//Ventilador 1

        Ventilador Ventilador1 = new Ventilador();
        Ventilador1.marca = "Arno";
        Ventilador1.potencia = 50;
        Ventilador1.tamanho = 20;

//Ventilador 2

        Ventilador Ventilador2 = new Ventilador();
        Ventilador2.marca = "Mondial";
        Ventilador2.potencia = 150;
        Ventilador2.tamanho = 50;

//Exibindo Resultados

        System.out.println("<---Sistema SmartWe--->");
        System.out.println("Marca: " + Ventilador1.marca + " | Potencia: "+ Ventilador1.potencia + "W | Tamanho: " + Ventilador1.tamanho + "CM");
        System.out.println("Marca: " + Ventilador2.marca + " | Potencia: "+ Ventilador2.potencia + "W | Tamanho: " + Ventilador2.tamanho + "CM");
    }

}