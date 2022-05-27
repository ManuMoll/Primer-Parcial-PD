package ejercicios.e5;

import interpreter.strcuture.Context;

public class Suma extends Operaciones{
    public Suma(int digit){
        this.digit=digit;
    }
    @Override
    public void interpreter(Contexto contexto){
        if (contexto.input.startsWith("+")){
            contexto.signo="+";
            contexto.input=contexto.input.substring(this.digit);
        }
    }
}
