package problem_1;

import java.util.ArrayList;

public class TestEmployee {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee employee_1 = new Employee();
        Employee employee_2 = new Employee();
        employees.add(employee_1);
        employees.add(employee_2);

        employee_1.setCpf("43500344322");
        employee_1.setName("Júlio dos Santos");
        employee_1.setWage(3450.00);

        employee_2.setCpf("304.304.223-33");
        employee_2.setName("Adriana Milena da Paz e Souza");
        employee_2.setWage(8550.40);

        for (Employee e: employees) {
            if (e.getNameCharQuantity() > 20) {
                System.out.println(e.getShortName());
            } else {
                System.out.println(e.getName());
            }

            if (!e.verifyCpfFormat()) {
                e.setCpf(e.formatCpf());
            }

            System.out.println(e.getCpf());

            e.addWageIncrease(10);

            System.out.println("Salários mínimos do funcionário: " + e.getName());
            System.out.println(e.getMinimumWageCount() + " salários");
            System.out.print(System.lineSeparator());
        }
    }
}
