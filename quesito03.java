import java.util.Arrays;

public class FaturamentoMensal {
    public static void main(String[] args) {
        // vetor de faturamento diário
        double[] faturamento = {1500.00, 1800.50, 1200.00, 0.00, 0.00, 2000.00, 2200.00, 
                                1700.00, 1900.00, 2500.00, 2800.00, 2100.00, 2300.00, 
                                1700.00, 1800.00, 2000.00, 1900.00, 2100.00, 2200.00, 
                                2500.00, 2700.00, 2800.00, 2900.00, 3000.00, 2500.00, 
                                2300.00, 2400.00, 2200.00, 2000.00, 2100.00};
        
        // calculando o menor valor de faturamento diário
        double menorFaturamento = faturamento[0];
        for (int i = 1; i < faturamento.length; i++) {
            if (faturamento[i] < menorFaturamento) {
                menorFaturamento = faturamento[i];
            }
        }
        System.out.println("Menor faturamento diário: R$" + menorFaturamento);
        
        // calculando o maior valor de faturamento diário
        double maiorFaturamento = faturamento[0];
        for (int i = 1; i < faturamento.length; i++) {
            if (faturamento[i] > maiorFaturamento) {
                maiorFaturamento = faturamento[i];
            }
        }
        System.out.println("Maior faturamento diário: R$" + maiorFaturamento);
        
        // calculando a média mensal de faturamento
        double somaFaturamento = 0.0;
        int qtdDiasFaturamento = 0;
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > 0.0) {
                somaFaturamento += faturamento[i];
                qtdDiasFaturamento++;
            }
        }
        double mediaFaturamento = somaFaturamento / qtdDiasFaturamento;
        
        // contando os dias em que o faturamento diário foi superior à média mensal
        int qtdDiasAcimaMedia = 0;
        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > mediaFaturamento) {
                qtdDiasAcimaMedia++;
            }
        }
        System.out.println("Número de dias com faturamento diário acima da média mensal: " + qtdDiasAcimaMedia);
    }
}