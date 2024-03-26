package activity;

public class Test {
    public static void main(String[] args) {
        ProductRegister register = getProductRegister();

        System.out.println("Produtos:");
        register.listProducts();
        register.orderProductsByPrice();

        System.out.println(System.lineSeparator());
        System.out.println("Produtos após ordenar:");

        register.listProducts();

        System.out.println(System.lineSeparator());
        System.out.println("Busca produtos com 'ml' no nome: ");

        register.searchProductsByName("ml");

        System.out.println(System.lineSeparator());
        System.out.println("Produtos com estoque baixo: ");

        register.showLowStockProducts();
    }

    private static ProductRegister getProductRegister() {
        Product p1 = new Product(
                1,
                "Coca Cola 350ml",
                2,
                5.99
        );

        Product p2 = new Product(
                2,
                "Heineken 600ml",
                5,
                13.99
        );

        Product p3 = new Product(
                3,
                "Derby Azul Mar",
                14,
                11.99
        );

        Product p4 = new Product(
                4,
                "Salgadinho Cheetos 60g",
                36,
                3.99
        );

        Product p5 = new Product(
                5,
                "Chocolate Garoto 90g",
                4,
                4.75
        );
        ProductRegister register = new ProductRegister();

        register.addProduct(p1);
        register.addProduct(p2);
        register.addProduct(p3);
        register.addProduct(p4);
        register.addProduct(p5);

        return register;
    }
}
