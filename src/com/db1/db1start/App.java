package com.db1.db1start;

import java.util.Scanner;

public class App {

    public static void main (String []args){

        System.out.println("Exercicio de inteiro");
        Integer numero1, numero2, soma;

        numero1 = 10;
        numero2 = 5;

        soma = numero1 + numero2;

        System.out.println(soma);

        Integer numero3, numero4, subtracao;

        numero3 = 10;
        numero4 = 5;

        subtracao = numero3 - numero4;
        System.out.println(subtracao);

        System.out.println("-----------------------");
        System.out.println("Exercicio de Texto");

        String texto1, texto2;

        texto1 = "patricia";
        texto2 = "PATRICIA";

        System.out.println(texto1 + " em maiusculo: " + texto1.toUpperCase());
        System.out.println(texto2 + " em minusculo: " + texto2.toLowerCase());


         System.out.println("-----------------------");
        System.out.println("Exercicio de Matematica");

        double numero5, numero6;
        numero5 = 1.5;
        numero6 = 2;

        if (numero5 <numero6)
            System.out.println("O valor menor eh: " + numero5);
        else{
            System.out.println("O valor menor eh: " + numero6);
        }






    }
}
