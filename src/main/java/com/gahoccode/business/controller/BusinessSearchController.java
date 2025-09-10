package com.gahoccode.business.controller;

import com.gahoccode.business.dto.SuggestionRequestParameters;
import com.gahoccode.business.service.SuggestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusinessSearchController {
    private final SuggestionService suggestionService;

    public BusinessSearchController(SuggestionService suggestionService) {
        this.suggestionService = suggestionService;
    }

    @GetMapping("/api/suggestions")
    public List<String> suggest(SuggestionRequestParameters parameters){
        return this.suggestionService.fetchSuggestions(parameters);
    }
}
