import java.util.ArrayList;

public class Tablet extends DispositivoTecnologico {
    private String resolucionPantalla;
    private ArrayList<Accesorio> accesorios;

    public Tablet(String marca, int memoriaRam, int memoriaAlmacenamiento, String procesador, String modelo, int anhoFabricacion, int precio, int stock, String resolucionPantalla) {
        super(marca, memoriaRam, memoriaAlmacenamiento, procesador, modelo, anhoFabricacion, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.accesorios = new ArrayList<>();

    }

    public String getResolucionPantalla() {
        return this.resolucionPantalla;
    }


    public ArrayList<Accesorio> getAccesorios() {
        return accesorios;
    }

    public String getType() {
        return "Tablet";
    }
    public  String toString(){
        String incluyeAccesorios=(accesorios.size()==0)?"Accesorios invluidos":"No incluye accesorios";
        return "Resolucion Pantalla: "+resolucionPantalla+", accesorios"+ incluyeAccesorios;
    }
}