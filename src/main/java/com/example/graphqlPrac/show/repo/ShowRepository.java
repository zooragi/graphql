package com.example.graphqlPrac.show.repo;

import com.example.graphqlPrac.show.domain.entity.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long>, ShowCustomRepository {
}
