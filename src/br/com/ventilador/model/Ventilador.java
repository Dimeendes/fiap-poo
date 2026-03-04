package br.com.ventilador.model;

public class Ventilador {
    private String marca;
    private double potencia;
    private int tamanho;
    private int temporizador;
    public boolean status;


    public String getMarca(){
        return this.marca;
    }

    private void setMarca(String marca){
        this.marca = marca;
    }

    public double getPotencia(){
        return this.potencia;
    }

    private void setPotencia(double potenciaEnergetica){
        if(potenciaEnergetica <= 0){
            this.potencia = potenciaEnergetica;

        }else{
            System.out.println("Erro: a potencia do seu ventilador nao pode ser um valor negativo!");
        }
    }

    public int getTamanho(){
        return this.tamanho;
    }

    private void setTamanho(int centimetros){
        if(tamanho <= 60){
            this.tamanho += centimetros;
        }else{
            System.out.println("Erro: ventiladores residenciais se limitam a ate 60cm de diametro!");
        }
    }
    
    public int getTemporizador(){
        return this.temporizador;
    }

    private void setTemporizador(int tempo){
        if(tempo >= 0){
            this.temporizador += tempo;
        }else{
            System.out.println("Erro: o temporizador deve ser maior que 1 segundo");
        }
    }

    public Ventilador(String marca){
        this.setMarca(marca);
        this.setPotencia(0);
        this.setTamanho(0);
        this.setTemporizador(0);
    }

    public void definirPotencia(double potenciaEnergetica){
        if(potenciaEnergetica <= 0){
            System.out.println("Erro: a potencia do seu ventilador deve ser maior que 0!");
            this.status = false;
            return;
        }
        this.potencia = potenciaEnergetica;
        this.status = true;
        System.out.println("Potencia do ventilador definida com sucesso! Potecia detectada: " + this.potencia + "W");
        
    }

    public void definirTamanho(int centimetros){
        if(centimetros > 60 || centimetros <= 0){
            System.out.println("Erro: o tamanho deve estar entre 1 e 60 cm de diametro!");
            this.status = false;
            return;
        }
            this.tamanho = centimetros;
            this.status = true;
            System.out.println("Tamanho do ventilador definido com sucesso! Tamanho detectado: " + this.tamanho + " cm");
    }

    public void definirTemporizador(int tempo){
        if(tempo > 180 || tempo <= 0){
            System.out.println("Erro: O temporizador nao pode exceder 3 horas (180 minutos) e deve ser maior que 0 minutos");
            this.status = false;
            return;
        }
        this.temporizador = tempo;
        this.status = true;
        System.out.println("Temporizador definido com sucesso! Temporizador detectado: " + this.temporizador + " minutos \n");
    }

    public boolean Verificar(boolean status){
        if(status == false){
                System.out.println("Um ou mais atributos deste aparelho foram atribuidos de maneira errada, corrija-os antes de ver os status!");
                return false;
        }else{
            return true;
        }
        
    }
}