import java.util.HashMap;
import java.util.Map;

public class Distribuidora {
    public static void main(String[] args) {
        double valorTotal = 100000;
        Map<String, Double> vendasPorEstado = new HashMap<String, Double>();
        vendasPorEstado.put("SP", 50000.0);
        vendasPorEstado.put("RJ", 25000.0);
        vendasPorEstado.put("MG", 15000.0);
        vendasPorEstado.put("RS", 10000.0);
        
        Map<String, Double> percentuais = new HashMap<String, Double>();
        for (String estado : vendasPorEstado.keySet()) {
            double vendas = vendasPorEstado.get(estado);
            double percentual = vendas / valorTotal * 100;
            percentuais.put(estado, percentual);
        }
        
        for (String estado : percentuais.keySet()) {
            double percentual = percentuais.get(estado);
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }
}