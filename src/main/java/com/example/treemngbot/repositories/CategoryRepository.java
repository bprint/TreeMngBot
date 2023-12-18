package com.example.treemngbot.repositories;

import com.example.treemngbot.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
