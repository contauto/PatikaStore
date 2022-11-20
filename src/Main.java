public class Main {
    public static void main(String[] args) {

        int uniqueId = 0;//benzersiz id üretme

        BrandManager brandManager=new BrandManager();
        CategoryManager categoryManager=new CategoryManager();
        ProductManager productManager=new ProductManager();

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
       //Ürün ekleme-Create

        Product[] laptops=new Product[5];

        for (int i = 0; i < laptops.length; i++) {
            laptops[i]=new Product(uniqueId++,5000+i,50+i,25+i,"Abra A5 18.1"+i,brandManager.getByName("Monster"),64+i,15.6+i,8+i,categoryManager.getCategoryByName("Notebook"));
            productManager.addProduct(laptops[i]);
        }

        Product[] phones=new Product[5];

        for (int i = 0; i < phones.length; i++) {
            phones[i]=new Product(uniqueId++,5000+i,50+i,25+i,"Zenphone"+i,brandManager.getByName("Asus"),64+i,15.6+i,5000,8+i,"Red",categoryManager.getCategoryByName("Phone"));
            productManager.addProduct(phones[i]);
        }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Printer.printBrand(brandManager.getAll());//Marka listeleme

        Printer.printProduct(productManager.getProductByCategory(1),"Laptop");//Kategoriye göre listeleme

        productManager.deleteProduct(1); //Ürün silme

        Printer.printProduct(productManager.getProductById(2),"Ürün"); //Id'ye göre listeleme

        Printer.printProduct(productManager.getProductByBrand("Monster"),"Marka"); //Markaya göre listeleme

        categoryManager.addCategory("Camera"); //Yeni kategori ekleme

    }

}
