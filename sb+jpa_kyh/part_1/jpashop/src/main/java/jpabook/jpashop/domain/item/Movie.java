package jpabook.jpashop.domain.item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "M")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
public class Movie extends Item {
    private String director;
    private String actor;
}
