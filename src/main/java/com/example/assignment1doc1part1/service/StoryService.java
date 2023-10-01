package com.example.assignment1doc1part1.service;

import com.example.assignment1doc1part1.model.Story;
import com.example.assignment1doc1part1.repository.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoryService {
    private final StoryRepository storyRepository;

    @Autowired
    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public List<Story> getAllStories() {
        return storyRepository.findAll();
    }

    public Optional<Story> getStoryById(Long id) {
        return storyRepository.findById(id);
    }

    public Story createStory(Story story) {
        return storyRepository.save(story);
    }

    public Story updateStory(Long id, Story story) {
        if (storyRepository.existsById(id)) {
            return storyRepository.save(story);
        }
        return null; // Handle not found scenario
    }

    public boolean deleteStory(Long id) {
        if (storyRepository.existsById(id)) {
            storyRepository.deleteById(id);
            return true;
        }
        return false; // Handle not found scenario
    }
}