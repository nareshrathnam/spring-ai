package com.demo.springapp.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ai")
public class PoetryController {
	
	private final PoetryService poetryService = null;

    // constructor

    @GetMapping("/cathaiku")
    public ResponseEntity<String> generateHaiku(){
        return ResponseEntity.ok(poetryService.getCatHaiku());
    }
}
