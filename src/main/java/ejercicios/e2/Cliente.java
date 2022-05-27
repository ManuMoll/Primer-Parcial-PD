package ejercicios.e2;

public class Cliente {
    public static void main (String[] args){
        RegistroCelulares input = new RegistroCelulares();
        input.setModelo("A1");
        input.setWeight("60");
        input.setCam("foco=10,lente= 5mp");
        input.setImei("XXXX");
        input.setorigen("Bolivia");

        RegistroCelulares cel1 = (RegistroCelulares)input.clone();
        cel1.setImei(10002);
        RegistroCelulares cel2 = (RegistroCelulares)input.clone();
        cel2.setImei(10003);
        RegistroCelulares cel3 = (RegistroCelulares)input.clone();
        cel3.setImei(10004);
        RegistroCelulares cel4 = (RegistroCelulares)input.clone();
        cel4.setImei(10005);
        RegistroCelulares cel5 = (RegistroCelulares)input.clone();
        cel5.setImei(10006);


        cel1.showInfo():
        cel2.showInfo():
        cel3.showInfo():
        cel4.showInfo():
        cel5.showInfo():

    }
}
