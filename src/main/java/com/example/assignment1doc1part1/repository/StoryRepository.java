package com.example.assignment1doc1part1.repository;

import com.example.assignment1doc1part1.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, Long> {
}
