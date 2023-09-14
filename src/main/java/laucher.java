public class laucher {
    public static void main(String[] args) {
        inicializar();
    }
    public static void inicializar(){
        TiendaElectronica tiendaElectronica=new TiendaElectronica("Avenida imaginaria");
        Cliente cliente=new Cliente("Pedrito","jaskjdha@asdasd.cl","Alcachofin",
                "56784563444","Divorciado","23456765-4", "Rancagua");
        tiendaElectronica.addCliente(cliente);
        Cliente cliente2=new Cliente("Pedrito","jaskjdha@asdasd.cl","Alcachofin",
                "56784563444","Divorciado","23456765-4", "Rancagua");
        tiendaElectronica.addCliente(cliente2);
        Notebook notebook=new Notebook("a",132,123,"Peruanizador 3000",
                "sadasds",123213,123123,1232132,"4k","Strashvishe"
                ,5000);
        Venta venta=new Venta(cliente);
        tiendaElectronica.getDispositivosTecnologicos().add(notebook);
        tiendaElectronica.addProductosAVenta(notebook,venta);
        tiendaElectronica.getInformacionDispositivo(notebook);
        tiendaElectronica.realizarVenta(venta);
    }
}