public class FactoriaDeSalidas {
    public static final int BICICLETA = 1;
    public static final int CAMION = 2;


    public static Transposte getProducto(int tipoTransporte) {
        switch (tipoTransporte) {
            case BICICLETA:
                return new Bicicleta();
            case CAMION:
                return new Camion();
        }
        return null;
    }
}
