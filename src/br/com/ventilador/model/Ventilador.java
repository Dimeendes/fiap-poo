package br.com.ventilador.model;

public class Ventilador {
    private String marca;
    private double potencia;
    private int tamanho;
    private int temporizador;

    public Ventilador(String marca, double potencia, int tamanho){
        this.marca = marca;
        this.potencia = potencia;
        this.tamanho = tamanho;
        this.setTemporizador(0);
    }

    public String getMarca(){   
        return this.marca;
    }

    public double getPotencia(){
        return this.potencia;
    }

    public int getTamanho(){
        return this.tamanho;
    }
    
    public int getTemporizador(){
        return this.temporizador;
    }

    private void setTemporizador(int tempo){
        if(tempo >= 0){
            this.temporizador = tempo;
        }else{
            System.out.println("Erro: o temporizador deve ser maior que 1 segundo");
        }
    }

    public void definirTemporizador(int tempo){
        if(tempo > 180 || tempo <= 0){
            System.out.println("Erro: O temporizador nao pode exceder 3 horas (180 minutos) e deve ser maior que 0 minutos");
            return;
        }
        setTemporizador(tempo);
        System.out.println("Temporizador definido com sucesso! Temporizador detectado: " + this.temporizador + " minutos \n");
    }

    public boolean isFuncionando(){
        if(this.tamanho > 60 || this.potencia <= 0){
                System.out.println("Um ou mais atributos deste aparelho foram atribuidos de maneira errada, corrija-os antes de ver os status!");
                return false;
        }else{
            return true;
        }
        
    }
}