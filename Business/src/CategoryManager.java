public class CategoryManager {
    CategoryDao categoryDao=new CategoryDao();


    public void addCategory(String name){
        categoryDao.addCategory(name);
    }

    public Category getCategoryByName(String name){
       return categoryDao.getCategoryByName(name);
    }
}
