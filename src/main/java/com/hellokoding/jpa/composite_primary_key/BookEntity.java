package com.hellokoding.jpa.composite_primary_key;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;
import java.util.Date;

@Entity
@IdClass(BookEntity.IdClass.class)
@Data
@Builder
public class BookEntity {
    @Id
    private String name;

    @Id
    private Date publishedDate;

    @Builder.Default
    private Date updatedDate = new Date();

    @Data
    static class IdClass implements Serializable {
        private String name;
        private Date publishedDate;
    }
}

