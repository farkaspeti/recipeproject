package com.codecool.recipeproject.controllers;

import com.codecool.recipeproject.domain.Category;
import com.codecool.recipeproject.domain.UnitOfMeasure;
import com.codecool.recipeproject.repositories.CategoryRepository;
import com.codecool.recipeproject.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }
    
    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");
    
        System.out.println("Category id is: " + categoryOptional.get().getId());
        System.out.println("Unit of measure id is: " + optionalUnitOfMeasure.get().getId());
        return "index";
    }
}
