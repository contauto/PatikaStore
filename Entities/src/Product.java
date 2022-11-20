public class Product {
    private int productId;
    private double unitPrice;
    private int discountRate;
    private int unitsInStock;
    private String productName;
    private Brand brand;
    private int memory;
    private double screenSize;
    private int batteryCapacity;
    private int ram;
    private String color;
    private Category category;



    public Product(int productId,double unitPrice, int discountRate, int unitsInStock, String productName, Brand brand, int memory, double screenSize, int batteryCapacity, int ram, String color, Category category) {
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.unitsInStock = unitsInStock;
        this.productName = productName;
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.ram = ram;
        this.color = color;
        this.category = category;
    }

    public Product(int productId,double unitPrice, int discountRate, int unitsInStock, String productName, Brand brand, int memory, double screenSize, int ram, Category category) {
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.unitsInStock = unitsInStock;
        this.productName = productName;
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
