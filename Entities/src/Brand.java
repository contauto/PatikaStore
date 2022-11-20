import java.util.List;

public class Brand {
    private int brandId;
    private String brandName;
    private List<Product> products;

    public Brand(int brandId, String brandName, List<Product> products) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.products = products;
    }

    public Brand(int brandId, String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
