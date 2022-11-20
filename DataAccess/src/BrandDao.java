import java.util.*;
import java.util.stream.Collectors;

public class BrandDao {
    public static List<Brand> brands = new ArrayList<>();

    public BrandDao() {
        String[] brandArray= {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
        for (int i = 0; i < brandArray.length; i++) {
            brands.add(new Brand(i,brandArray[i]));
        }
    }

    public Brand getByName(String name){

        for (Brand brand:brands
        ) {
            try {
                if(brand.getBrandName().equals(name)){
                    return brand;
                }
            }catch (Exception e){

            }

        }
        return null;
    }

    public List<Brand> getAll(){
        Collections.sort(brands,new SortByName());
        return brands;
    }

}
