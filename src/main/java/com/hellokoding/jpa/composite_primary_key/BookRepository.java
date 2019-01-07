package com.hellokoding.jpa.composite_primary_key;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface BookRepository extends JpaRepository<BookEntity, BookEntity.IdClass> {
}
