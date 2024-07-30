public class Main {
    public static void main(String[] args) {
        NavegadorGPS gps= new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("punto_A","punto_B");
        gps.setRutaStrategy(new RutaMasRapida());
        gps.calcularRuta("Punto_A","Punto_B");
        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("punto_A","punto_B");
        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("punto_A","punto_B");


    }
}