package jpabook.jpashop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    // Embedded 어노테이션에 대해 원리와 이유 정리
    @Embedded
    private Address address;

    // 다대일 관계 or 일대다 관계에서의 매핑 어노테이션 정리
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
