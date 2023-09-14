public class Pantalla {
    private String marca;
    private String modelo;
    private int anhoFabricacion;

    public Pantalla(String marca, String modelo, int anhoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anhoFabricacion = anhoFabricacion;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnhoFabricacion() {
        return this.anhoFabricacion;
    }
}