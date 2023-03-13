package com.example.graphqlPrac.show.service;

import com.example.graphqlPrac.show.domain.entity.Show;
import com.example.graphqlPrac.show.repo.ShowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShowService {
    private final ShowRepository showRepository;

    public List<Show> findAllByTitle(String titleFilter) {
        return showRepository.findAllByTitle(titleFilter);
    }

}
