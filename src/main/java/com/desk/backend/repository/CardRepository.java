package com.desk.backend.repository;

import com.desk.backend.models.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardRepository extends JpaRepository<Cards,Long> {


}
