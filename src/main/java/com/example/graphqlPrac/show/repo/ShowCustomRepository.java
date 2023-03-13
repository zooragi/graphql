package com.example.graphqlPrac.show.repo;

import com.example.graphqlPrac.show.domain.entity.Show;

import java.util.List;

public interface ShowCustomRepository {
    List<Show> findAllByTitle(String titleFilter);
}
