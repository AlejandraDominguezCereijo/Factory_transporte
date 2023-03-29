public class Main {
    static Transposte mostrar;
    public static void main(String[] args) {
        mostrar=FactoriaDeSalidas.getProducto(FactoriaDeSalidas.BICICLETA);
        mostrar.costeTotal(36211);
        mostrar.tipoEmbalaje(5F, 5F, 5F, 5F);

        mostrar=FactoriaDeSalidas.getProducto(FactoriaDeSalidas.CAMION);
        mostrar.costeTotal(26004);
        mostrar.tipoEmbalaje(5F,5F,5F,10F);

        mostrar=FactoriaDeSalidas.getProducto(FactoriaDeSalidas.BARCO);
        mostrar.costeTotal(25003);
        mostrar.tipoEmbalaje(3F,5F,4F,8F);

    }
}
