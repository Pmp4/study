package jpabook.jpashop.domain.Item;

import jpabook.jpashop.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)   // 상속관계 매핑 전략 : Single Table, 추가로 조인/각 테이블 전략
@DiscriminatorColumn(name = "dtype")                    // 상속관계 매핑에서의 구분 값 명칭
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;

    private int price;

    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();
}
