package problem_B_C;

public class Test {
    public static void main(String[] args) {
        House houseA = new House(
                new Address("Rua Caramuru", "32", "Ouro Preto", "Paulista"),
                "White frost",
                new Door(1.80, "blue"),
                new Garage(2, true, null),
                true,
                new Owner("Carlos Alberto", "3445-3040"),
                120.50
        );

        House houseB = new House(
                new Address("Rua Caramuru", "49", "Ouro Preto", "Paulista"),
                "Aqua",
                null,
                new Garage(2, true, null),
                false,
                new Owner("Joaquim Rivieira", null),
                88.25
        );

        houseA.setColor("Green");

        houseB.setHaveWall(true);

        houseB.setOwner(new Owner("Ana Raquel", "3543-3434"));

        String sameOwners = houseA.getOwner().equals(houseB.getOwner()) ? "Sim" : "Não";
        System.out.println("Proprietário da Casa A é igual ao da casa B ?" + System.lineSeparator() + sameOwners);

        double houseBTax = houseB.calculateIPTU();
        double houseATax = houseA.calculateIPTU();

        System.out.println(
                "Imposto Casa A: R$ " + houseATax
                + System.lineSeparator()
                + "Imposto Casa B: R$ " + houseBTax
        );

    }
}
