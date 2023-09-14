public class Computador extends DispositivoTecnologico {
    private String grafica;
    private String fuenteDePoder;
    private String chasis;
    private Pantalla pantalla;

    public Computador(String marca, int memoriaRam, int memoriaAlmacenamiento, String procesadpr, String modelo, int anhoFabricacion, int precio, int stock, String grafica, String fuenteDePoder, String chasis, Pantalla pantalla) {
        super(marca, memoriaRam, memoriaAlmacenamiento, procesadpr, modelo, anhoFabricacion, precio, stock);
        this.grafica = grafica;
        this.fuenteDePoder = fuenteDePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }

    public String getGrafica() {
        return this.grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public String getFuenteDePoder() {
        return this.fuenteDePoder;
    }

    public void setFuenteDePoder(String fuenteDePoder) {
        this.fuenteDePoder = fuenteDePoder;
    }

    public String getChasis() {
        return this.chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getType() {
        return "Computador";
    }
    public String toString(){
        return "Grafica: "+grafica+", fuente de poder: "+fuenteDePoder+", chasis"+chasis+", pantalla: "+pantalla.getMarca()
                +" "+pantalla.getModelo()+" "+pantalla.getAnhoFabricacion();

    }
}