import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDao {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(int id) {
        products.removeIf(product -> product.getProductId() == id);
    }

    public List<Product> getProductByBrand(String brand) {
        return products.stream().filter(p -> p.getBrand().getBrandName().equals(brand)).collect(Collectors.toList());
    }

    public List<Product> getProductById(int id) {
        return products.stream().filter(p -> p.getProductId() == id).collect(Collectors.toList());
    }

    public List<Product> getProductByCategory(int id) {
        return products.stream().filter(p -> p.getCategory().getCategoryId() == id).collect(Collectors.toList());
    }
}
