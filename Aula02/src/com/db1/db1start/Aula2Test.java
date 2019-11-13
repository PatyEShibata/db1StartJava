package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class Aula2Test {

    @Test
    public void deveRetornar5(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.soma(2,3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar10(){
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.soma(5,5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar4(){
        Application application = new Application();
        Integer expected = 4;
        Integer response = application.subtracao(10,6);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar1(){
        Application application = new Application();
        Integer expected = 1;
        Integer response = application.multiplicacao(1,1);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar2(){
        Application application = new Application();
        Integer expected = 2;
        Integer response = application.divisao(2,1);
        Assert.assertEquals(expected, response);
    }


    @Test
    public void deveRetornarPar(){
        Application application = new Application();
        Boolean expected = true;
        Boolean response = application.par(2);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar7(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.maior(3,7);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarQuantidadeImpar(){
        Application application = new Application();
        Integer expected = 3;
        Integer response = application.quantidadeImpar(6);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarLetrasMaiuscula(){
        Application application = new Application();
        String expected = "PATRICIA";
        String response = application.letrasMaiuscula("Patricia");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarLetrasMinuscula(){
        Application application = new Application();
        String expected = "patricia";
        String response = application.letrasMinuscula("PATRICIA");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarQuantidadedeLetra7(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.quantidadeLetra();
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarQuantidadedeLetraEspaco7(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.quantidadeLetraEspaco();
        Assert.assertEquals(expected, response);

    }

    @Test
    public void deveRetornarSequenciaDeLetrasSeparadas(){
        Application application = new Application();
        String[] expected = new String [] {"banana" , "maçã" , "melancia"};
        String [] response = application.retornarPalavrasSeparadas("banana, maçã, melancia");
        Assert.assertArrayEquals(expected, response);
    }
















}
