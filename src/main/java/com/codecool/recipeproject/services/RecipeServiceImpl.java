package com.codecool.recipeproject.services;

import com.codecool.recipeproject.domain.Recipe;
import com.codecool.recipeproject.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    
    private final RecipeRepository recipeRepository;
    
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    
    @Override
    public Set<Recipe> getRecepies() {
        log.debug("im in the recipe service");
        Set<Recipe> recipeSet = new HashSet<>();
        
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
