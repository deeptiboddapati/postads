package com.deepti.postads.controller;

import com.deepti.postads.data.AdRepository;
import com.deepti.postads.data.CategoryRepository;
import com.deepti.postads.model.Ad;
import com.deepti.postads.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AdsController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private AdRepository adRepository;
    @RequestMapping(value = "/")
    public String listGifs(ModelMap modelMap){
        List<Ad> allAds = adRepository.getAllGifs();
        modelMap.put("ads", allAds);
        return "home";
    }

    @RequestMapping("/ad/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap) {
        Ad ad = adRepository.findByName(name);
        modelMap.put("ad", ad);

        Category category = categoryRepository.findById(ad.getCategoryId());
        modelMap.put("category", category);
        return "ad-details";
    }
}
