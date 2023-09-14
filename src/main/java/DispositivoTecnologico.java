public abstract class DispositivoTecnologico {
    private String marca;
    private int memoriaRam;
    private int memoriaAlmacenamiento;
    private String procesador;
    private String modelo;
    private int anhoFabricacion;
    private int precio;
    private int stock;

    public DispositivoTecnologico(String marca, int memoriaRam, int memoriaAlmacenamiento, String procesador, String modelo, int anhoFabricacion, int precio, int stock) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
        this.procesador = procesador;
        this.modelo = modelo;
        this.anhoFabricacion = anhoFabricacion;
        this.precio = precio;
        this.stock = stock;
    }

    public String getMarca() {
        return this.marca;
    }

    public int getMemoriaRam() {
        return this.memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getMemoriaAlmacenamiento() {
        return this.memoriaAlmacenamiento;
    }

    public void setMemoriaAlmacenamiento(int memoriaAlmacenamiento) {
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
    }

    public String getProcesador() {
        return this.procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnhoFabricacion() {
        return this.anhoFabricacion;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public abstract String toString();

    public abstract String getType();
}