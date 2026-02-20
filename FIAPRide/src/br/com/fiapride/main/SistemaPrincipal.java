package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
/*import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Carlos Souza";
        passageiro2.saldo = 12.50;

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
        
        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
    }
}
    */

import br.com.fiapride.model.Ventilador;

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

        System.out.println("<---SISTEMA SmartWe--->");
        System.out.println("Marca: " + Ventilador1.marca + " | Potencia: "+ Ventilador1.potencia + "W | Tamanho: " + Ventilador1.tamanho + "CM");
        System.out.println("Marca: " + Ventilador2.marca + " | Potencia: "+ Ventilador2.potencia + "W | Tamanho: " + Ventilador2.tamanho + "CM");
    }

}