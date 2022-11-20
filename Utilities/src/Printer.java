import java.util.List;

public class Printer {

    //Return ettiğimiz değerleri ekrana bastırmaya yarayan araç

    public static void printProduct(List<Product> products,String qualification) {

        System.out.println(qualification+" Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat         | Marka     | Depolama  | Ekran      | RAM        | Pil       | Renk      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");


        for (Product product : products
        ) {
            System.out.printf("| %-2s | %-30s| %-10s TL | %-10s| %-10s| %-10s | %-10s | %-10s| %-10s|\n",
                    product.getProductId(), product.getProductName(), product.getUnitPrice(), product.getBrand().getBrandName(),
                    product.getMemory(), product.getScreenSize(), product.getRam(),(product.getBatteryCapacity()==0?"NaN": product.getBatteryCapacity()),(product.getColor()==null?"NaN": product.getColor()));
        }

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
    }



    public static void printBrand(List<Brand> brands) {

        System.out.println("Markalarımız");
        System.out.println("--------------");
        for (Brand brand : brands
        ) {
            System.out.println("-" + brand.getBrandName());
        }


    }

}
