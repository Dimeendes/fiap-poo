
package br.com.ventilador.main;

import br.com.ventilador.model.Ventilador; //importando a classe ventilador

public class SistemaPrincipal {
    
    public static void main(String[] args){ 
        System.out.println("<---Iniciando Sistema SmartWe--->\n");

//Ventilador 1

        Ventilador Ventilador1 = new Ventilador("Arno");
        System.out.println("Potencia do ventilador 1: ");
        Ventilador1.definirPotencia(50);
        System.out.println("Tamanho do ventilador 1: ");
        Ventilador1.definirTamanho(20);
        System.out.println("Temporizador do ventilador 1: ");
        Ventilador1.definirTemporizador(65);

//Ventilador 2 (Testes com valores além do limite estabelecido, causando erro esperado)

        Ventilador Ventilador2 = new Ventilador("Mondial");
        System.out.println("Potencia do ventilador 2: ");
        Ventilador2.definirPotencia(-150);
        System.out.println("Tamanho do ventilador 2: ");
        Ventilador2.definirTamanho(61);
        System.out.println("Temporizador do ventilador 2: ");
        Ventilador2.definirTemporizador(190);

//Exibindo Resultados

        System.out.println("\n<---Status do ventilador 1 --->");
        if(Ventilador1.Verificar(Ventilador1.status) == true){
                System.out.println("Marca: " + Ventilador1.getMarca() + " | Potencia: "+ Ventilador1.getPotencia() + " W | Tamanho: " + Ventilador1.getTamanho() + "CM");
        }
        System.out.println("\n<---Status do ventilador 2 --->");
        if(Ventilador2.Verificar(Ventilador2.status) == true){
                System.out.println("Marca: " + Ventilador2.getMarca() + " | Potencia: "+ Ventilador2.getPotencia() + " W | Tamanho: " + Ventilador2.getTamanho() + "CM");
        } 
        System.out.println("\n<---Temporizador 1--->");
        if(Ventilador2.Verificar(Ventilador1.status) == true){
                System.out.println("O ventilador " + Ventilador1.getMarca() +" desligara em: " + Ventilador1.getTemporizador() + " minutos!");
        }
         System.out.println("\n<---Temporizador 2--->");
        if(Ventilador2.Verificar(Ventilador2.status) == true){
                System.out.println("O ventilador " + Ventilador2.getMarca() +" desligara em: " + Ventilador2.getTemporizador() + " minutos!");
        }
        //Testes de encapsulamento (Remova os comentários para testar)
        /*Ventilador1.marca = "Teste";
        Ventilador2.marca = "Teste";*/
        


}
        
}