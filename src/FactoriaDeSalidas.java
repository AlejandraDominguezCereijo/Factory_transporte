public class FactoriaDeSalidas {
    /**
     * opción de uso para cuando sea bicicleta
     */
    public static final int BICICLETA = 1;
    /**
     * opción de uso para cuando sea camion
     */
    public static final int CAMION = 2;
    /**
     * opción de uso para cuando sea barco
     */

    public static final int BARCO = 3;
    /**
     * Getter.
     * @param tipoTransporte    entero que queremos para seleccionar el tipo de transporte
     * @return null.
     */

    public static Transposte getProducto(int tipoTransporte) {
        switch (tipoTransporte) {
            case BICICLETA:
                return new Bicicleta();
            case CAMION:
                return new Camion();
            case BARCO:
                return new Barco();
        }
        return null;
    }
}
