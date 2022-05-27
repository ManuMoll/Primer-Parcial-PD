package ejercicios.e2;

public class RegistroCelulares {
    private String Modelo;
    private String Weight;
    private String Cam;
    private String Imei;
    private String Origen;

    public RegistroCelulares{
    }
    public String getModelo(){
        return Modelo;
    }
    public void  setModelo(String modelo){
        this.Modelo = modelo;
    }
    public  String getWeight(){
        return Weight;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
    public String getCam(){
        return cam();
    }
    public void setCam(String cam) {
        this.cam = cam;
    }
    public String getImei(){
        return imei();
    }
    public void setImei(String imei) {
        this.imei = imei;
    }
    public String getOrigen(){
        return origen;
    }


}
