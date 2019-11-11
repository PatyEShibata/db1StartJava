package com.db1.db1start;

import java.util.Scanner;

public class App {

    public static void main (String []args){

        Scanner scan = new Scanner (System.in);
        System.out.println("Exercicio de inteiro");
        Integer soma, subtrair;

        System.out.println("Digite o numero 1: ");
        Integer numero1 = scan.nextInt();

        System.out.println("Digite o numero 2: ");
        Integer numero2 = scan.nextInt();

        soma = numero1 + numero2;
        subtrair = numero1 - numero2;

        System.out.println("A soma dos numeros " + numero1 + " e " + numero2 + " eh " + soma);
        System.out.println("A subtração dos numeros " + numero1 + " e " + numero2 + " eh " + subtrair);


        System.out.println("-----------------------");
        System.out.println("Exercicio de Texto");

        Scanner scan1 = new Scanner (System.in);
        String textoNormal = scan1.nextLine();

        String textoEmMinusculo = textoNormal.toLowerCase();
        String textoEmMaiusculo = textoNormal.toUpperCase();


        System.out.println(textoNormal + " em maiusculo: " + textoEmMaiusculo);
        System.out.println(textoNormal + " em minusculo: " + textoEmMinusculo);


         System.out.println("-----------------------");
        System.out.println("Exercicio de Matematica");

        Scanner scan2 = new Scanner (System.in);
        System.out.println("Digite o valor 1: ");
        Double valor1 = scan2.nextDouble();

        System.out.println("Digite o valor 2: ");
        Double valor2 = scan2.nextDouble();

        if (valor1 <valor2)
            System.out.println("O valor menor eh: " + valor1);
        else{
            System.out.println("O valor menor eh: " + valor2);
        }

        Scanner scan3 = new Scanner (System.in);
        System.out.println("Digite o valor 1: ");
        Double valor3 = scan3.nextDouble();

        System.out.println("Digite o valor 2: ");
        Double valor4 = scan3.nextDouble();

        System.out.println("Digite o valor 3: ");
        Double valor5 = scan3.nextDouble();

        if ((valor3 < valor4) && (valor3 < valor5)) {
            System.out.println("O valor menor eh: " + valor3);
        } else if ((valor4 < valor5) && (valor4 < valor3)){
            System.out.println("O valor menor eh: " + valor4);
        }else {
            System.out.println("O valor menor eh: " + valor5);
        }






    }
}
