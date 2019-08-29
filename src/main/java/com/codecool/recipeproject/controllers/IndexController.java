package com.codecool.recipeproject.controllers;

import com.codecool.recipeproject.domain.Category;
import com.codecool.recipeproject.domain.UnitOfMeasure;
import com.codecool.recipeproject.repositories.CategoryRepository;
import com.codecool.recipeproject.repositories.UnitOfMeasureRepository;
import com.codecool.recipeproject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    
    private final RecipeService recipeService;
    
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    
    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){
       model.addAttribute("recipes",recipeService.getRecepies());
    
        
        return "index";
    }
}
