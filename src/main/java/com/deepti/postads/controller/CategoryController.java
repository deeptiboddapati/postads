package com.deepti.postads.controller;


import com.deepti.postads.data.CategoryRepository;
import com.deepti.postads.data.AdRepository;
import com.deepti.postads.model.Category;
import com.deepti.postads.model.Ad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private AdRepository adRepository;
    @RequestMapping(value = "/categories")
    public String listCategories(ModelMap modelMap){
        List<Category> allCategories= categoryRepository.getAllCategories();
        modelMap.put("categories", allCategories);
        return "categories";
    }
    @RequestMapping("/category/{id}")
    public String categoryDetails(@PathVariable int id, ModelMap modelMap) {
        Category category = categoryRepository.findById(id);
        modelMap.put("category", category);

        List<Ad> ads = adRepository.findByCategoryId(id);
        modelMap.put("ads", ads);
        return "category";
    }
}
