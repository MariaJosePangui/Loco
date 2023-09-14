public class Notebook extends DispositivoTecnologico {
    private String resolucionPantalla;
    private String tipoTeclado;
    private int bateria;

    public Notebook(String marca, int memoriaRam, int memoriaAlmacenamiento, String procesadpr, String modelo, int anhoFabricacion, int precio, int stock, String resolucionPantalla, String tipoTeclado, int bateria) {
        super(marca, memoriaRam, memoriaAlmacenamiento, procesadpr, modelo, anhoFabricacion, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.tipoTeclado = tipoTeclado;
        this.bateria = bateria;
    }

    public String getResolucionPantalla() {
        return this.resolucionPantalla;
    }

    public String getTipoTeclado() {
        return this.tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    public int getBateria() {
        return this.bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public String getType() {
        return "Notebook";
    }
    public  String toString(){
        return "Resolucion Pantalla: "+resolucionPantalla+", tipo teclado:"+tipoTeclado+", capacidad bateria: "+bateria;
    }
}