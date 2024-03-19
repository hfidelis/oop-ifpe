package problem_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Employee {

    private String name;
    private String cpf;
    private double wage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        boolean containLetters = false;

        for (char l: cpf.toCharArray()) {
            if (Character.isLetter(l)) {
                containLetters = true;
            }
        }

        if (containLetters) {
            throw new Exception("O CPF não pode conter letras alfabéticas!");
        } else {
            this.cpf = cpf;
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public Employee() { }

    public boolean equals(Employee comparison) {
        return this.cpf.equals(comparison.cpf);
    }

    public int getNameCharQuantity() {
        if (!this.name.isBlank() && !this.name.isEmpty()) {
            return this.name.length();
        }

        return 0;
    }

    public String getShortName() {
        String[] names = this.name.split(" ", 0);
        return names[0] + " " + names[(names.length - 1)];
    }

    public String getInitialChars() {
        StringBuilder initials = new StringBuilder();
        String[] names = this.name.split(" ", 0);

        for (String name: names) {
            initials.append(name.charAt(0));
        }

        return initials.toString();
    }

    public boolean verifyCpfFormat() {
        if (!this.cpf.isEmpty() && !this.cpf.isBlank()) {
            String cpfRegex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

            Pattern pattern = Pattern.compile(cpfRegex);

            Matcher matcher = pattern.matcher(this.cpf);

            return matcher.matches();
        }

        return false;
    }

    public String formatCpf() {
        if (this.verifyCpfFormat()) {
            return this.cpf;
        }

        String cleanCpf = this.cpf.replaceAll("[^0-9]", "");
        StringBuilder formattedCpf = new StringBuilder(cleanCpf);

        formattedCpf.insert(3, '.')
                    .insert(7, '.')
                    .insert(11, '-');

        return formattedCpf.toString();
    }

    public int getMinimumWageCount() {
        double minimumWage = 1412.00;

        if (this.wage > 0) {
            return (int)(Math.ceil(this.wage / minimumWage));
        }

        return 0;
    }

    public void addWageIncrease(double percentage) {
        if (this.wage > 0) {
            this.wage = (this.wage + (this.wage * (percentage / 100)));
        }
    }
}
