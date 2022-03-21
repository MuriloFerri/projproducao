package br.ulbra.classe;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class UsaProducao extends Producao{
    public static void main(String[] args) {
        
        Producao prod = new Producao(0);
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Hora: " + prod.getHora());
        System.out.println("Minuto: " + prod.getMinuto());
        System.out.println("Segundo: " + prod.getSegundo());
        System.out.println("Segundos: "+ prod.getSegundos());
        System.out.println(prod.toString());
        
        prod.calcularHMS();
        System.out.println("Digite o nome da peça: ");
        prod.setPeca(ler.nextLine());
        System.out.println("Digite o tempo de produção:");
        prod.setSegundos(ler.nextInt());
        prod.calcularHMS();
        System.out.println(prod.toString());

    }

    public UsaProducao(int hora) {
        super(hora);
    }
}
