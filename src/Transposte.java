public interface Transposte {
    /**
     * Salida por ventana o consala de un mensaje
     *
     * @param cp    entero que queremos poner como condicion
     * @return null
     */
    Float costeTotal(Integer cp);
    /**
     * Salida por ventana o consala de un mensaje
     *
     * @param x    Float que queremos poner como condicion
     * @param y    Float que queremos poner como condicion
     * @param z    Float que queremos poner como condicion
     * @param peso Float que queremos poner como condicion, en este caso solo use este.
     * @return null
     */
    Integer tipoEmbalaje(Float x,Float y, Float z,Float peso);
}
