package com.gahoccode.business.controller;

import com.gahoccode.business.dto.SearchRequestParameters;
import com.gahoccode.business.dto.SearchResponse;
import com.gahoccode.business.dto.SuggestionRequestParameters;
import com.gahoccode.business.service.SearchService;
import com.gahoccode.business.service.SuggestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BusinessSearchController {
    private final SearchService searchService;
    private final SuggestionService suggestionService;

    public BusinessSearchController(SearchService searchService, SuggestionService suggestionService) {
        this.searchService = searchService;
        this.suggestionService = suggestionService;
    }

    @GetMapping("/api/suggestions")
    public List<String> suggest(SuggestionRequestParameters parameters){
        return this.suggestionService.fetchSuggestions(parameters);
    }

    @GetMapping("/api/search")
    public SearchResponse search(SearchRequestParameters parameters){
        return this.searchService.search(parameters);
    }
}
