package com.workintech.fswebs18challengemaven.repository;

import com.workintech.fswebs18challengemaven.entity.Card;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository {

    Card save(Card card);
    List<Card> findByColor(String color);
    List<Card> findAll();
    List<Card> findByValue(Integer value);
    List<Card> findByType(String type);
    Card update(Card card);
    Card remove(Long id);
}