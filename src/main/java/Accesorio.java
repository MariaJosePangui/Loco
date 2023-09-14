public class Accesorio {
    private String nombre;
    private String modelo;
    private String funcionalidad;

    public Accesorio(String nombre, String modelo, String funcionalidad) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.funcionalidad = funcionalidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFuncionalidad() {
        return this.funcionalidad;
    }

    public void setFuncionalidad(String funcionalidad) {
        this.funcionalidad = funcionalidad;
    }
}