package com.example.graphqlPrac.show.repo;

import com.example.graphqlPrac.show.domain.entity.Show;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.graphqlPrac.show.domain.entity.QShow.show;

@Repository
@RequiredArgsConstructor
public class ShowCustomRepositoryImpl implements ShowCustomRepository{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Show> findAllByTitle(String titleFilter) {
        return jpaQueryFactory.selectFrom(show)
                .where(show.title.contains(titleFilter))
                .fetch();
    }
}
