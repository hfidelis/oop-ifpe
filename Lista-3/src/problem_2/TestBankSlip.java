package problem_2;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestBankSlip {
    public static void main (String[] args) {
        ArrayList<BankSlip> bankSlips = new ArrayList<>();
        double totalValue = 0;

        BankSlip bankslip1 = new BankSlip(
                "1",
                "Ambev",
                LocalDate.of(2023, 4, 15),
                1560
        );

        BankSlip bankslip2 = new BankSlip(
                "2",
                "Coca-Cola",
                LocalDate.of(2023, 4, 10),
                2450
        );

        BankSlip bankslip3 = new BankSlip(
                "3",
                "Ambev",
                LocalDate.of(2023, 4, 4),
                1560
        );

        bankSlips.add(bankslip1);
        bankSlips.add(bankslip2);
        bankSlips.add(bankslip3);

        bankslip3.extendExpiration();

        for (BankSlip b: bankSlips) {
            System.out.println("Valor final: Boleto" + b.getNumber());
            System.out.println("R$ " + b.calcFinalValue());
            System.out.print(System.lineSeparator());
            totalValue += b.calcFinalValue();
        }

        if (bankslip1.equals(bankslip3)) {
            System.out.println("Boletos iguais");
        }

        System.out.println("Soma final dos boletos: R$ " + totalValue);

    }
}
