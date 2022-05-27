package ejercicios.e5;

public class Division extends Operaciones {
    public Division(int digit){
        this.digit=digit;
    }
    @Override
    public void interpreter (Contexto contexto){
        if (contexto.input.startsWith("/")){
            contexto.signo="/";
            contexto.input=contexto.input.substring(this.digit);
        }
    }
}
