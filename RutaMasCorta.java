public class RutaMasCorta implements RutaStrategy {
    @Override
    public String calcularRuta(String punto_A, String punto_B) {
        if (punto_A.equals("Ciudad a") && punto_B.equals("Ciudad B")) {
            return "Ruta mas corta";
        } else {
            return "Ruta mas corta calculada entre " + punto_A + " y " + punto_SB;
        }
    }