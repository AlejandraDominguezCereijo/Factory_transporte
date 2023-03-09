public class Bicicleta implements Transposte {
    public static final int palet = 5;
    public static final int envoltorio_carton = 10;
    public static final int caja_madera = 15;

    @Override
    public Float costeTotal(Integer cp) {
        if (cp < 30000) {
            System.out.println("El coste de tu envio en bicicleta es de 10€");
        } else {
            System.out.println("El coste de tu envio en bicicleta es de 15€");
        }
        return null;
    }

    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        if (peso <= palet) {
            System.out.println("Tu paquete se enviara en un palet");
        }
        if (peso > palet && peso <= envoltorio_carton) {
            System.out.println("Tu paquete se enviara en una envoltorio de carton");
        }
        if (peso >= caja_madera) {
            System.out.println("Tu paquete se enviara en una caja de madera");
        }
        return null;
    }
}
