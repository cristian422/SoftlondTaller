public class App {
    public static void main(String[] args) throws Exception {
        ConversorMoneda conversorMoneda =new ConversorMoneda();

        conversorMoneda.convertirDolaresAEuros(40);
        conversorMoneda.convertirDolaresAPesos(40);
        conversorMoneda.convertirEurosADolares(100);
        conversorMoneda.convertirPesosADolares(200000);
    }
}
