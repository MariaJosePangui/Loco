import java.util.ArrayList;

public class Venta {
    private String estadoVenta;
    private Cliente cliente;
    private ArrayList<DispositivoTecnologico> dispositivoTecnologicos;

    public Venta(Cliente cliente) {
        this.cliente=cliente;
        this.dispositivoTecnologicos=new ArrayList<>();
        this.estadoVenta="pendiente";
    }

    public String getEstadoVenta() {
        return estadoVenta;
    }


    public void setEstadoVenta(String estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    public ArrayList<DispositivoTecnologico> getDispositivoTecnologicos() {
        return dispositivoTecnologicos;
    }

    public boolean addProducto(DispositivoTecnologico dispositivoTecnologico) {
        if(dispositivoTecnologico!=null){
            dispositivoTecnologicos.add(dispositivoTecnologico);
            return true;
        }
        return false;
    }
}