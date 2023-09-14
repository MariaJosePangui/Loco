import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String email;
    private String apellido;
    private String numeroContacto;
    private String estadoCivil;
    private String rut;
    private String ciudad;
    public Cliente(String nombre, String email, String apellido, String numeroContacto, String estadoCivil, String rut, String ciudad) {
        this.nombre = nombre;
        this.email = email;
        this.apellido = apellido;
        this.numeroContacto = numeroContacto;
        this.estadoCivil = estadoCivil;
        this.rut = rut;
        this.ciudad = ciudad;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getNumeroContacto() {
        return this.numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}