import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.getProductId() == targetId) {
                return product;
            }
        }
        return null;
    }

    // Binary Search (array must be sorted by productId)
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int midId = products[mid].getProductId();

            if (midId == targetId) {
                return products[mid];
            } else if (midId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    // Utility to sort products by productId
    public static void sortProductsById(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shampoo", "Personal Care"),
            new Product(150, "Mobile Phone", "Electronics"),
            new Product(300, "Desk Chair", "Furniture"),
            new Product(110, "Water Bottle", "Accessories")
        };

        // Linear Search
        Product found = linearSearch(products, 150);
        System.out.println("Linear Search: " + (found != null ? found.getProductName() : "Not found"));

        // Sort for Binary Search
        sortProductsById(products);
        found = binarySearch(products, 150);
        System.out.println("Binary Search: " + (found != null ? found.getProductName() : "Not found"));
    }
}
