import java.util.ArrayList;
public class TiendaElectronica {
    private String direccion;
    private ArrayList<DispositivoTecnologico> dispositivosTecnologicos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Venta> ventas;

    public TiendaElectronica(String direccion) {
        this.direccion = direccion;
        this.ventas=new ArrayList<>();
        this.clientes=new ArrayList<>();
        this.dispositivosTecnologicos=new ArrayList<>();
    }

    public String getDireccion() {
        return this.direccion;
    }

    public boolean addCliente(Cliente cliente) {
        for(Cliente cliente1:this.clientes){
            if(cliente1.getRut().equals(cliente.getRut())){
                System.out.println("El cliente ya esta registrado");
                return false;
            }
        }
        clientes.add(cliente);
        System.out.println("Cliente añadido correctamente");
        return true;
    }

    public ArrayList<DispositivoTecnologico> getDispositivosTecnologicos() {
        return dispositivosTecnologicos;
    }

    public boolean getInformacionDispositivo(DispositivoTecnologico dispositivoTecnologico) {
        boolean existeEnElSistema=false;
        for(DispositivoTecnologico dispositivoTecnologico1:this.dispositivosTecnologicos){
            if(dispositivoTecnologico1.getModelo().equals(dispositivoTecnologico.getModelo())){
                existeEnElSistema=true;
            }
        }
        if(dispositivoTecnologico!=null && existeEnElSistema){
            System.out.println(dispositivoTecnologico.getType()+", marca: "+dispositivoTecnologico.getMarca()+
                    ", modelo: "+ dispositivoTecnologico.getModelo());
            System.out.println(", memoria RAM: "+dispositivoTecnologico.getMemoriaRam()+", memoria Almacenamiento: "+
                    dispositivoTecnologico.getMemoriaAlmacenamiento()+", procesador: "+ dispositivoTecnologico.getProcesador());
            System.out.println("Precio: $"+dispositivoTecnologico.getPrecio()+", año de fabricacion: "+dispositivoTecnologico.getAnhoFabricacion());
            System.out.println("Stock: "+ dispositivoTecnologico.getStock());
            System.out.println(dispositivoTecnologico.toString());
            return true;
        }
        System.out.println("El dispositivo consultado no es valido");
        return false;
    }

    public boolean addProductosAVenta(DispositivoTecnologico dispositivoTecnologico, Venta venta) {
        if(dispositivoTecnologico!=null){
            if(dispositivoTecnologico.getStock()!=0){
                venta.addProducto(dispositivoTecnologico);
                System.out.println("Agregado correctamente");
                return true;
            }
        }
        System.out.println("No se pudo ingresar correctamente");
        return false;
    }

    public boolean realizarVenta(Venta venta) {
        int precio=0;
        if(venta.getEstadoVenta().equals("pendiente")){
            for (DispositivoTecnologico dispositivoTecnologico:venta.getDispositivoTecnologicos()){
                precio=+dispositivoTecnologico.getPrecio();
                dispositivoTecnologico.setStock(dispositivoTecnologico.getStock()-1);
            }
            venta.setEstadoVenta("completada");
            System.out.println("Valor venta: "+precio+", el stock fue ajustado ");
            return true;
        } else if (venta.getEstadoVenta().equals("completada")) {
            System.out.println("La venta ya fue realizada");
        }
        return false;
    }
}