package activity;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductRegister {
    private final ArrayList<Product> products;

    public ProductRegister() {
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        for (Product p: this.products) {
            System.out.println(
                    "Produto: " + p.getName() + " | R$ " + p.getPrice()
            );
        }
    }

    public Product getProductById(int id) {
        for (Product p: this.products) {
            if (p.getId() == id) {
                System.out.println(p.toString());
                return p;
            }
        }

        return null;
    }

    public void deleteById(int id) {
        this.products.removeIf(p -> p.getId() == id);
    }

    public void updateById(int id, Product data) {
        for (Product p: this.products) {
            if (p.getId() == id) {
                p.setName(data.getName());
                p.setPrice(data.getPrice());
                p.setQuantity(data.getQuantity());

                break;
            }
        }
    }

    public double getTotalFromStock() {
        double total = this.products.stream()
                                    .mapToDouble(p -> p.getQuantity() * p.getPrice())
                                    .sum();

        System.out.println("Valor total em estoque: R$ " + total);

        return total;
    }

    public void showLowStockProducts() {
        for (Product p: this.products) {
            if (p.getQuantity() < 5) {
                System.out.println(p.toString());
            }
        }
    }

    public void orderProductsByPrice() {
        this.products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public ArrayList<Product> searchProductsByName(String name) {
        ArrayList<Product> results = new ArrayList<Product>();

        for (Product p: this.products) {
            if (p.getName().contains(name)) {
                results.add(p);
                System.out.println(p.toString());
            }
        }

        return results;
    }

    public void clearAllProducts() {
        this.products.clear();
    }
}
