package jpabook.jpashop.domain.item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "A")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
public class Album extends Item {
    private String author;
    private String isbn;
}
