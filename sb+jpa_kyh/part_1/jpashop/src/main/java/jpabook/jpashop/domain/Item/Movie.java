package jpabook.jpashop.domain.Item;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")    // 상속관계 매핑에서의 '구분 값'
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Movie extends Item {
    private String director;
    private String actor;
}
