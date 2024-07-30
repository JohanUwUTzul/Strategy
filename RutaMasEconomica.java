public class RutaMasEconomica implements RutaStrategy {
    @Override
    public String calcularRuta(String punto_A, String punto_B) {
        if (punto_A.equals("Ciudad A") && punto_B.equals("Ciudad B")) {
            return "Ruta mas economica";
        } else {
            return "Ruta mas económica calculada entre " + punto_A + " y " + punto_B;
        }
    }
}
