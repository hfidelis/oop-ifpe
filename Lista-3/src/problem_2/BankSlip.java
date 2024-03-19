package problem_2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BankSlip {
    private String number;
    private String supplier;
    private double value;
    private LocalDate expirationDate;

    public BankSlip(String number, String supplier, LocalDate expirationDate, double value) {
        this.number = number;
        this.supplier = supplier;
        this.value = value;
        this.expirationDate = expirationDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isExpired() {
        if (this.expirationDate != null) {
            return LocalDate.now().isAfter(this.expirationDate);
        }

        return false;
    }

    public double calcPenalty() {
        if (this.isExpired() && this.value > 0) {
            long days = ChronoUnit.DAYS.between(this.expirationDate, LocalDate.now());
            double penaltyPerDay = (this.value * (0.01));

            return penaltyPerDay * days;
        }

        return 0;
    }

    public void extendExpiration() {
        if (this.expirationDate != null) {
            this.expirationDate = this.expirationDate.plusDays(5);
        }
    }

    public double calcDiscount() {
        if (!this.isExpired()) {
            long days = ChronoUnit.DAYS.between(LocalDate.now(), this.expirationDate);
            double discountPerDay = (this.value * (0.005));

            return days * discountPerDay;
        }

        return 0;
    }

    public double calcFinalValue() {
        double finalValue = 0;

        if (this.value > 0) {
            if (this.isExpired()) {
                double penalty = this.calcPenalty();
                finalValue = (this.value + penalty);
            } else {
                double discount = this.calcDiscount();
                finalValue = (this.value - discount);
            }
        }

        return finalValue;
    }

    public boolean equals(BankSlip comparison) {
        return (this.supplier.equals(comparison.supplier)) && (this.value == comparison.value);
    }
}
