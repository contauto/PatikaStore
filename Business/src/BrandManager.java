import java.util.List;
import java.util.Optional;

public class BrandManager {
    BrandDao brandDao= new BrandDao();

    public Brand getByName(String name){
        return brandDao.getByName(name);
    }
    public List<Brand> getAll(){
        return brandDao.getAll();
    }
}
