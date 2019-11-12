package com.db1.db1start;

import java.util.Scanner;

public class Aula2 {

/*    Exercício de Inteiro (Integer)
1 - some dois números
2 - subtraia dois números

    Exercícios de Texto (String)
1 - Crie uma variável que recebe um texto com letras minusculas e imprima com LETRAS MAIUSCULAS
2 - Crie uma variável que receba um texto e devolva ele em LETRAS MINUSCULAS

    Exercício de Matematica (Double)
1 - Crie duas variáveis double, defina um valor para cada, e exiba qual é o menor valor entre dois
2 - Crie três variáveis double, defina um valor p	ara cada,  e exiba qual é o menor valor entre os três*/


    public static String subtrair(Integer numero1, Integer numero2){

        Integer resultado;
        resultado = numero1 - numero2;
        return "O resultado é: " + resultado;
    }

    public static String uperCase(String texto){
        return texto.toUpperCase();

    }

    public static String lowerCase(String texto){
        return texto.toLowerCase();
    }

    public static Double menor (Double valor1, Double valor2){
        if (valor1<valor2){
            return valor1;
        }
        return valor2;
    }
   /* public static Double menor(Double valor1, Double valor2, Double valor3){
       if(valor1<valor2 && valor1<valor3){
            return valor1;
        }else if (valor2 < valor1 && valor2 < valor3){
            return valor2;
        }
        return valor3;
    }
*/
   public static Double menor(Double valor4,Double valor5,Double valor6){
       return menor(menor(valor4,valor5),valor6);
   }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Número 1: ");
        Integer numero1 = scan.nextInt();
        scan.nextLine();

        System.out.println("Número 2: ");
        Integer numero2 = scan.nextInt();
        scan.nextLine();

        String resultado = subtrair(numero1, numero2);
        System.out.println(subtrair(numero1, numero2));

        System.out.println("--------------------");
        System.out.println("Exercicio de Texto");

        Scanner scan1 = new Scanner (System.in);
        System.out.println("Digite um texto: ");
        String texto = scan1.nextLine();

        System.out.println(uperCase(texto));
        System.out.println(lowerCase(texto));

        System.out.println("--------------------");
        System.out.println("Exercicio de Matematica - 1");

        Scanner scan2 = new Scanner (System.in);
        System.out.println("Digite o numero 1: ");
        Double valor1 = scan2.nextDouble();

        System.out.println("Digite o numero 2: ");
        Double valor2 = scan2.nextDouble();

        System.out.println("O valor menor é: " + menor(valor1,valor2));

       System.out.println("Exercicio de Matematica - 2");
       Scanner scan3 = new Scanner(System.in);
        System.out.println("Digite o numero 1: ");
       Double valor4 = scan3.nextDouble();

        System.out.println("Digite o numero 2: ");
        Double valor5 = scan3.nextDouble();

        System.out.println("Digite o numero 3: ");
        Double valor6 = scan3.nextDouble();

        System.out.println("O valor menor é: " + menor(valor4, valor5, valor6));




    }

}

