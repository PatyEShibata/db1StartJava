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
    public void deveRetornar8(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.soma(5,3);
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
        Integer response = application.multiplicacao(2,1);
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
    public void deveRetornar3(){
        Application application = new Application();
        Integer expected = 3;
        Integer response = application.multiplicacao(3,1);
        Assert.assertEquals(expected, response);
    }







}
