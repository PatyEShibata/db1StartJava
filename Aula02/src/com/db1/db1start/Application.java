package com.db1.db1start;

public class Application {

    public Integer soma(Integer numero1, Integer numero2){
        return numero1+numero2;
    }

    public Integer subtracao(Integer numero1, Integer numero2){
        return numero1-numero2;
    }

    public Integer multiplicacao(Integer numero1, Integer numero2){
        return numero1*numero2;
    }

    public Integer divisao(Integer numero1, Integer numero2){
        return numero1/numero2;
    }

    public Boolean par (Integer numero){
        if (numero % numero == 0 ){
            return true;
        } return false;

    }

    public Integer maior(Integer numero1, Integer numero2){
        if (numero1>numero2){
            return numero1;
        }
        return numero2;
    }

    public Boolean impar(Integer numero){
        for (i=0, i<numero, i++){
            if (numero % numero == 0){
                return i+1;
            }
        }
    }


}
