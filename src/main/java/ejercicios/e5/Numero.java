package ejercicios.e5;

public class Numero extends Operaciones{
    public Numero(int digit){
        this.digit = digit;
    }
    @Override
    public void interpreter(Contexto contexto){
        if (contexto.signo.equals("+")){
            contexto.output = contexto.output + (Integer.parseInt(contexto.input.substring(0, this.digit)));
            contexto.input = contexto.input.substring(this.digit);
        }else if(contexto.signo.equals("/")){
            contexto.output = contexto.output/(Integer.parseInt(contexto.input.substring(0, this.digit)));
            contexto.input = contexto.input.substring(this.digit);
        }else {
            contexto.output = contexto.output + (Integer.parseInt(contexto.input.substring(0, this.digit)));
            contexto.input = contexto.input.substring(this.digit);
        }
    }
}
