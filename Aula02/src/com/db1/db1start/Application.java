package com.db1.db1start;

public class Application {

/*    Exercícios de Inteiro (Integer)
1 - Método que some dois números
2 - Método que subtraia dois números
3 - Método que multiplique dois números
4 - Método que divida dois números
5 - Método que diga se o número é par
6 - Método que receba dois números e diga qual é o maior
7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ele.

    Exercícios de Texto (String)
1 - Método que receba um texto e devolva ele em LETRAS MAIUSCULAS
2 - Método que receba um texto e devolva ele em LETRAS MINUSCULAS
3 - Método que receba DB1START e retorne a quantidade de letras que existe nesta palavra
4 - Método que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe
5 - Método que retorne o item 4 com a mesma quantidade de letras do item 3.
6 - Método que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
7 - Método que receba o seu nome completo e exiba a partir da terceira letra do seu nome
8 - Método que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
9 - Método que receba o seu nome completo e substitua o seu primeiro nome por ALUNO/ALUNA
10 - Método que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
11 - Método que receba um texto e exiba quantas vogais tem no texto
12 - Método que receba um texto e devolva ele invertido

    Exercícios de Matemática (Double)
1 - Método que exiba qual é o menor valor entre dois doubles
2 - Método que exiba qual é o menor valor entre três doubles 3 - Método que exiba a média de três números
4 - Método que calcule a área de um triangulo*/

    public Integer soma(Integer numero1, Integer numero2) {
        return numero1 + numero2;
    }

    public Integer subtracao(Integer numero1, Integer numero2) {
        return numero1 - numero2;
    }

    public Integer multiplicacao(Integer numero1, Integer numero2) {
        return numero1 * numero2;
    }

    public Integer divisao(Integer numero1, Integer numero2) {
        return numero1 / numero2;
    }

    public Boolean par(Integer numero) {
        if (numero % numero == 0) {
            return true;
        }
        return false;

    }

    public Integer maior(Integer numero1, Integer numero2) {
        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;
    }

    public Integer quantidadeImpar(Integer numero) {
        if (numero % 2 == 0) {
            return numero / 2;
        } else {
            return (numero + 1) / 2;
        }
    }

    public String letrasMaiuscula(String texto) {
        return texto.toUpperCase();
    }

    public String letrasMinuscula(String texto) {
        return texto.toLowerCase();
    }

    public Integer quantidadeLetra() {
        Integer numero = 0;
        String texto = "DB1START";
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '1' | texto.charAt(i) == '2' | texto.charAt(i) == '3' | texto.charAt(i) == '4' | texto.charAt(i) == '5' | texto.charAt(i) == '6' | texto.charAt(i) == '7' | texto.charAt(i) == '8' | texto.charAt(i) == '9') {
                numero = numero + 1;
            }
        }
        return (texto.length() - numero);
    }

    public Integer quantidadeLetraEspaco() {
        Integer numero = 0;
        String texto = " DB1START ".trim();
        Integer total = texto.trim().length();
        for (int i = 0; i < total; i++) {
            if (texto.charAt(i) == '1' | texto.charAt(i) == '2' | texto.charAt(i) == '3' | texto.charAt(i) == '4' | texto.charAt(i) == '5' | texto.charAt(i) == '6' | texto.charAt(i) == '7' | texto.charAt(i) == '8' | texto.charAt(i) == '9') {
                numero = numero + 1;
            }
        }
        return (total - numero);
    }

    public String [] retornarPalavrasSeparadas (String valor){
        return valor.split(", ");

    }


}
