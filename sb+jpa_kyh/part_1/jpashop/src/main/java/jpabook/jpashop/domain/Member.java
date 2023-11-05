package jpabook.jpashop.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Embedded
    private Address address;

    // 양방향 연관관계, 'mappedBy' 통해 연관관계의 '비소유'를 명시함으로 무분별한 foreign key 변경을 막는다.
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
