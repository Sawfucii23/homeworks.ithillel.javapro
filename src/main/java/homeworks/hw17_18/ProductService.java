package homeworks.hw17_18;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    List<Product> products;

    public ProductService(List<Product> products) {
        this.products = products;
    }

    public List<Product> getBooksOver250() {
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public List<Product> getDiscountedBooks() {
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.isDiscountApplicable())
                .peek(p -> p.price *= 0.9)
                .collect(Collectors.toList());
    }

    public Product getCheapestBook() throws Exception {
        return products.stream()
                .filter(p -> p.getType().equals("Book"))
                .min(Comparator.comparing(Product::getPrice))
                .orElseThrow(() -> new Exception("Продукт [категорія: Book] не знайдено"));
    }

    public List<Product> getLastThreeProducts() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getDateAdded).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public double calculateTotalCostOfCurrentYearBooks() {
        return products.stream()
                .filter(p -> p.getType().equals("Book") && p.getDateAdded().getYear() == LocalDateTime.now().getYear() && p.getPrice() <= 75)
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
