package com.example.assignment1doc1part1.controller;

import com.example.assignment1doc1part1.model.Story;
import com.example.assignment1doc1part1.repository.StoryRepository;
import com.example.assignment1doc1part1.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stories")
public class StoryController {
    private final StoryService storyService;

    @Autowired
    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    @GetMapping
    public List<Story> getAllStories() {
        return storyService.getAllStories();
    }

    @GetMapping("/{id}")
    public Optional<Story> getStoryById(@PathVariable Long id) {
        return storyService.getStoryById(id);
    }

    @PostMapping
    public Story createStory(@RequestBody Story story) {
        return storyService.createStory(story);
    }

    @PutMapping("/{id}")
    public Story updateStory(@PathVariable Long id, @RequestBody Story story) {
        return storyService.updateStory(id, story);
    }

    @DeleteMapping("/{id}")
    public boolean deleteStory(@PathVariable Long id) {
        return storyService.deleteStory(id);
    }
}
