package ejercicios.e5;

import java.util.ArrayList;
import java.util.List;


public class Interpreter extends Operaciones {
    private List<Operaciones> gramatica = new ArrayList<>();
    private Contexto contexto;

    public Interpreter(String msgToInterpreter) {
        contexto = new Contexto(msgToInterpreter.replace(" ", ""));
        for (String charOriginal : msgToInterpreter.split(" ")) {
            switch (charOriginal) {
                case "+":
                    gramatica.add(new Suma(charOriginal.length()));
                    break;
                case "/":
                    gramatica.add(new Division(charOriginal.length()));
                    break;
                default:
                    gramatica.add(new Numero(charOriginal.length()));
                    break;


            }
        }
    }

    public int evaluarMSG() {
        for (Operaciones expression : gramatica) {
            expression.interpreter(contexto);
        }
        return contexto.output;
    }
    @Override
    public void interpreter(Contexto contexto) {

    }
}

