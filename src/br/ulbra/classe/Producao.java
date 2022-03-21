package br.ulbra.classe;

/**
 * 16/03/2022
 *
 * @author 
 */
public class Producao {

    private String peca;
    private int segundos;
    private int hora;
    private int minuto;
    private int segundo;

    public Producao(int hora) {
        this.peca = "mouse";
        this.segundos = 100;
        this.hora = hora;
      
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
        
        if (segundos < 0) {
            this.segundos = 100;
            
        }else{
            this.segundos = segundos;

        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void calcularHMS() {
        int ssegundos;
        ssegundos = 0;
        this.hora = this.segundos/ 3600;
        ssegundos = this.segundos % 3600;
        this.minuto = ssegundos / 60;
        ssegundos %= 60;
        segundo = ssegundos;
    }

    @Override
    public String toString() {
        return  "peca: " + this.getPeca()
                + " levou um total de "
                + this.getSegundos() 
                + " levou "
                + this.getHora() 
                + ": Hora(s)" 
                + this.getMinuto() 
                + ": Minuto(s) " 
                + this.getSegundo() 
                + " Segundo(s) para ficar pronto!!";
    }
}
