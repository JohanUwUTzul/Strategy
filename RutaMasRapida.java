public class RutaMasRapida implements RutaStrategy {
    @Override
    public String calcularRuta(String punto_A, String punto_B) {
        if (punto_A.equals("Ciudad A") && punto_B.equals("Ciudad B")) {
            return "Ruta mas rapida";
        } else {
            return "Ruta mas rapida calculada entre " + punto_A + " y " + punto_B;
        }
    }
}