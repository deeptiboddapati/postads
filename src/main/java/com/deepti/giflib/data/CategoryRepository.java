package com.deepti.giflib.data;

import com.deepti.giflib.model.Category;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CategoryRepository {
    private static final List<Category> CATEGORY_LIST =  Arrays.asList(
            new Category(2, "Furniture"),
            new Category(3, "Pets"),
            new Category(4, "Cars")
    );
    public Category findByName( String name ){
        for( Category category : CATEGORY_LIST ){
            if(category.getName().equals(name)){
                return category;
            }
        }
        return null;
    }
    public Category findById(int id ){
        for( Category category: CATEGORY_LIST ){
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }
    public List<Category> getAllCategories(){
        return CATEGORY_LIST;
    }
}
