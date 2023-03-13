package com.example.graphqlPrac.show.presentation;

import com.example.graphqlPrac.show.domain.entity.Show;
import com.example.graphqlPrac.show.service.ShowService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
@RequiredArgsConstructor
public class ShowsDatafetcher {

    private final ShowService showService;

    @DgsQuery
    public List<Show> shows(@InputArgument String titleFilter) {

        return showService.findAllByTitle(titleFilter);
    }
}