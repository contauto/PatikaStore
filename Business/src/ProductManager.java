import java.util.List;

public class ProductManager {
    ProductDao productDao=new ProductDao();

    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    public void deleteProduct(int id) {
        productDao.deleteProduct(id);
    }

    public List<Product> getProductByBrand(String brand) {
        return productDao.getProductByBrand(brand);
    }

    public List<Product> getProductById(int id) {
        return productDao.getProductById(id);
    }

    public List<Product> getProductByCategory(int id) {
        return productDao.getProductByCategory(id);
    }
}
