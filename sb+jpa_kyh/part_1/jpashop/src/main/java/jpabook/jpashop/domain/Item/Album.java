package jpabook.jpashop.domain.Item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("A")    // 상속관계 매핑에서의 '구분 값'
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Album extends Item {
    private String artist;
    private String etc;
}
