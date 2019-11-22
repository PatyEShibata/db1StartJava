package com.db1.db1start;

import java.util.*;

public class ExercicioSet {

    public static void main (String[] args){
        //Crie um set com uma lista de nomes com 5 nomes sendo adicionados mais de uma vez
        Set<String> nomes = new HashSet<>();
        nomes.add("Maria");
        nomes.add("Fátima");
        nomes.add("Ronaldo");
        nomes.add("Maria");
        nomes.add("Suzana");

        System.out.println(nomes);

        //Remova os nomes "Suzete" OU começados com "F" ou terminados em "naldo"
        nomes.removeIf(nome -> nome.substring(0,1) == "F"|| nome == "Suzete" || nome.endsWith("naldo"));
        System.out.println(nomes);

        //Encontre no set "Suzana" (ou não...), Se existir exiba com todas letras maiúsculas
        String nomeSu = "Suzana";
        if (nomes.contains(nomeSu)){
            System.out.println(nomeSu.toUpperCase());
        }

        //Em um set com números inteiros encontre o menor, o maior, a soma e a média
        HashSet <Integer> numeros = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        Integer soma = 0;


        for (Integer n : numeros){
            min = n < min ? n : min;
            max = n > max ? n : max;
            soma += n;
        }
        float media = soma.floatValue()/4;

        System.out.println("Menor: " + min);
        System.out.println("Maior: " + max);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
