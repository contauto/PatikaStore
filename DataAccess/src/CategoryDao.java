import java.util.ArrayList;
import java.util.List;

public class CategoryDao {

    List<Category> categories=new ArrayList<>();
    String[] currentCategories={"Phone","Notebook"};

    public CategoryDao(){
        for (int i = 0; i <currentCategories.length ; i++) {
            Category category = new Category(i,currentCategories[i]);
            categories.add(category);
        }

    }

    public void addCategory(String name){
        Category category=new Category(categories.size(),name);
        categories.add(category);
    }

    public Category getCategoryByName(String name){
            for (Category category:categories
            ) {
                try {
                    if(category.getCategoryName().equals(name)){
                        return category;
                    }
                }catch (Exception e){

                }

            }
            return null;
        }
    }
