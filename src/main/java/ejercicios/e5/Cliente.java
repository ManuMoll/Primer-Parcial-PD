package ejercicios.e5;

public class Cliente {
    public static void main(String[]args){
        String msg="10 / 2 + 5 + 5 + 5";
        Interpreter parser = new Interpreter(msg);
        System.out.println("msg interpretado:" +parser.evaluarMSG());
    }
}
