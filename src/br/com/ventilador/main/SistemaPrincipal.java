
package br.com.ventilador.main;

import br.com.ventilador.model.Ventilador; //importando a classe ventilador

public class SistemaPrincipal {
    
    public static void main(String[] args){ 
        System.out.println("<---Iniciando Sistema SmartWe--->\n");

//Ventilador 1

        Ventilador Ventilador1 = new Ventilador("Arno", 50.0, 20);
        System.out.println("Temporizador do ventilador " + Ventilador1.getMarca() + ": ");
        Ventilador1.definirTemporizador(65);

//Ventilador 2 (Testes com valores além do limite estabelecido, causando erro esperado)

        Ventilador Ventilador2 = new Ventilador("Mondial", -150.0, 61);
        System.out.println("Temporizador do ventilador " + Ventilador2.getMarca() + ": ");
        Ventilador2.definirTemporizador(190);

//Exibindo Resultados

        System.out.println("\n<---Status do ventilador 1 --->");
        if(Ventilador1.isFuncionando()){
                System.out.println("Marca: " + Ventilador1.getMarca() + " | Potencia: "+ Ventilador1.getPotencia() + " W | Tamanho: " + Ventilador1.getTamanho() + "CM");
        }
        System.out.println("\n<---Status do ventilador 2 --->");
        if(Ventilador2.isFuncionando()){
                System.out.println("Marca: " + Ventilador2.getMarca() + " | Potencia: "+ Ventilador2.getPotencia() + " W | Tamanho: " + Ventilador2.getTamanho() + "CM");
        } 
        System.out.println("\n<---Temporizador 1--->");
        if(Ventilador1.isFuncionando()){
                System.out.println("O ventilador " + Ventilador1.getMarca() +" desligara em: " + Ventilador1.getTemporizador() + " minutos!");
        }
         System.out.println("\n<---Temporizador 2--->");
        if(Ventilador2.isFuncionando()){
                System.out.println("O ventilador " + Ventilador2.getMarca() +" desligara em: " + Ventilador2.getTemporizador() + " minutos!");
        }
        //Testes de encapsulamento (Remova os comentários para testar)
        /*Ventilador1.marca = "Teste";
        Ventilador2.marca = "Teste";
        Ventilador1.potencia = 15;
        Ventilador2.potencia = 20;*/
        


}
        
}