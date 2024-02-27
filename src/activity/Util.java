package activity;

import java.lang.Math;

/**
 * Classe utilitária com métodos que realizam cálculos.
 * @version 1.0
 * @author hfidelis
 */
public final class Util {
    private Util() {}

    /**
     * Realiza a soma de dois números inteiros.
     * @param x Número inteiro para a soma.
     * @param y Número inteiro para a soma.
     * @return Resultado da soma dos inteiros.
     */
    public static int sum(int x, int y) {
        return  x + y;
    }

    /**
     * Realiza a soma de dois números inteiros
     * retornando o valor absoluto do resultado.
     * @param x Número inteiro para a soma.
     * @param y Número inteiro para a soma.
     * @return Resultado absoluto da soma entre os inteiros.
     */
    public static int sumPositive(int x, int y) {
        return Math.abs(sum(x, y));
    }

    /**
     * Realiza a subtração entre dois números do tipo double,
     * a operação ocorre na ordem dos parâmetros (x - y).
     * @param x Número do tipo double.
     * @param y Número do tipo double.
     * @return Resultado de (x - y).
     */
    public static double subtract(double x, double y) {
        return  x - y;
    }

    /**
     * Realiza a subtração entre dois números do tipo double,
     * a operação ocorre na ordem dos parâmetros (x - y), por fim
     * retornando o valor absoluto da operação.
     * @param x Número do tipo double.
     * @param y Número do tipo double.
     * @return Resultado absoluto de (x - y).
     */
    public static double subtractPositive(double x, double y) {
        return Math.abs(subtract(x, y));
    }

    /**
     * Calcula o resto da divisão entre dois números inteiros,
     * a operação ocorre na ordem dos parâmetros ( x % y).
     * @param x Número inteiro.
     * @param y Número inteiro.
     * @return Resto da operação de divisão entre 'x' e 'y'.
     */
    public static int getRemainder(int x, int y) {
        return  x % y;
    }

    /**
     * Ajusta o valor de uma nota baseado em uma nota máxima
     * e uma nota mínima. Caso ultrapasse a nota máxima (10),
     * será retornado a nota máxima, o mesmo para a nota mínima (0),
     * caso seja menor. Se a nota estiver entre as duas, retorna a
     * própria nota.
     * @param grade Nota para ser ajustada, do tipo double.
     * @return Nota ajustada.
     */
    public static double adjustGrade(double grade) {
        double MAX_GRADE = 10;
        double MIN_GRADE = 0;

        if (grade > MAX_GRADE) {
            return  MAX_GRADE;
        } else if (grade < MIN_GRADE) {
            return  MIN_GRADE;
        }

        return  grade;
    }

    /**
     * Calcula a média aritmética entre três notas, ajustadas utilizando
     * o método adjustGrade(double grade).
     * @param grade1 Primeira nota.
     * @param grade2 Segunda nota.
     * @param grade3 Terceira nota.
     * @return Média aritmética entre as três notas.
     */
    public static double calcAverage(double grade1, double grade2, double grade3) {
        double TOTAL = adjustGrade(grade1) + adjustGrade(grade2) + adjustGrade(grade3);
        double QUANTITY = 3;

        return TOTAL / QUANTITY;
    }

    /**
     * Enum de situações acadêmicas, o valor
     * de cada situação pode ser acessado utilizando
     * o método getValue().
     */
    public enum Situation {
        APPROVED("APROVADO"),
        DISAPPROVED("REPROVADO"),
        DISAPPROVED_BY_FAULT("REPROVADO POR FALTA"),
        FINAL_EXAM("EXAME FINAL");

        private final String value;

        Situation(String value) {
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }

    }

    /**
     * Verifica a situação acadêmica baseada na média entre
     * três notas.
     * @param grade1 Primeira nota.
     * @param grade2 Segunda nota.
     * @param grade3 Terceira nota.
     * @return Valor da situação acadêmica calculada.
     */
    public static String verifySituation(double grade1, double grade2, double grade3) {
        double AVERAGE_RESULT = calcAverage(grade1, grade2, grade3);
        double AVERAGE_GRADE = 7.0;
        double MIN_GRADE = 2.0;

        if (AVERAGE_RESULT >= AVERAGE_GRADE) {
            return Situation.APPROVED.getValue();
        }

        if (AVERAGE_RESULT < AVERAGE_GRADE && AVERAGE_RESULT >= MIN_GRADE) {
            return Situation.FINAL_EXAM.getValue();
        }

        return  Situation.DISAPPROVED.getValue();
    }

    /**
     * Verifica a situação acadêmica completa, considerando o percentual de frequência e
     * as três notas. Caso a frequência esteja abaixo do mínimo permitido, retorna a
     * situação de reprovação por falta, caso contrário, retorna a situação de
     * acordo com a média entre as notas.
     * @param grade1 Primeira nota.
     * @param grade2 Segunda nota.
     * @param grade3 Terceira nota.
     * @param frequency Percentual de frequência. (0.0 - 1.0)
     * @return Situação acadêmica.
     */
    public static String verifyFullSituation(double grade1, double grade2, double grade3, double frequency) {
        double MIN_FREQ = 0.75;
        if (frequency < MIN_FREQ) {
            return  Situation.DISAPPROVED_BY_FAULT.getValue();
        }

        return verifySituation(grade1, grade2, grade3);
    }
}
