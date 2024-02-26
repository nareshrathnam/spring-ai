package com.demo.springapp.client;

@RestController
@RequestMapping("ai")
public class PoetryController {
    private final PoetryService poetryService;

    // constructor

    @GetMapping("/cathaiku")
    public ResponseEntity<String> generateHaiku(){
        return ResponseEntity.ok(poetryService.getCatHaiku());
    }
}
