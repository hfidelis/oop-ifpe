package activity;

/**
 * Classe que realiza testes dos métodos da
 * classe utilitária Util.
 * @version 1.0
 * @author hfidelis
 */
public class UtilTest {
    public static void main(String[] args) {
        testMethod("somar()/sum()",
                    Util.sum(20, 35));
        testMethod("somarPositivo()/sumPositive()",
                    Util.sumPositive(50, -350));
        testMethod("subtrair()/subtract()",
                    Util.subtract(35.56, 23.13));
        testMethod("subtrairPositivo()/subtractPositive()",
                    Util.subtractPositive(-99.34, 120.33));
        testMethod("obterResto()/getRemainder()",
                    Util.getRemainder(200, 7));
        testMethod("ajustarNota()/adjustGrade()",
                    Util.adjustGrade(-2));
        testMethod("ajustarNota()/adjustGrade()",
                    Util.adjustGrade(13));
        testMethod("ajustarNota()/adjustGrade()",
                    Util.adjustGrade(9.5));
        testMethod("calcularMedia()/calcAverage()",
                    Util.calcAverage(9, 7.5, 8.75));
        testMethod("verificarAprovacao()/verifySituation()",
                    Util.verifySituation(9, 8.5, 7));
        testMethod("verificarAprovacao()/verifySituation()",
                    Util.verifySituation(1, 2, 3));
        testMethod("verificarAprovacao()/verifySituation()",
                    Util.verifySituation(1, 2, 1));
        testMethod("verificarAprovacaoCompleta()/verifyFullSituation()",
                    Util.verifyFullSituation(1, 1, 1, 0.45));
        testMethod("verificarAprovacaoCompleta()/verifyFullSituation()",
                    Util.verifyFullSituation(1, 3, 4, 0.85));
        testMethod("verificarAprovacaoCompleta()/verifyFullSituation()",
                    Util.verifyFullSituation(8, 6.50, 10, 0.85));
        testMethod("verificarAprovacaoCompleta()/verifyFullSituation()",
                    Util.verifyFullSituation(1, 1, 1, 0.85));
    }

    /**
     * Exibe o nome e o resultado de um método,
     * respectivamente com o tipo do resultado.
     * @param method Nome do método.
     * @param result Resultado da execução do método.
     * @param <T> Generic para englobar os tipos de resultados.
     */
    public static <T> void testMethod(String method, T result) {
        System.out.println(">> Executando método: " + method);
        System.out.println(">> RESULTADO: " + result);
        System.out.println(">> TIPO DO RESULTADO: " + result.getClass());
        System.out.println(System.lineSeparator());
    }
}
