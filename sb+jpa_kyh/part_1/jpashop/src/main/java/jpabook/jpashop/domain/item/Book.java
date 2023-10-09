package jpabook.jpashop.domain.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "B")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
public class Book extends Item {
    private String artist;
    private String etc;
}
