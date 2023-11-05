package jpabook.jpashop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@AllArgsConstructor
public class Address {
    private String city;
    private String street;
    private String zipcode;

    // JPA 에서는 Entity의 기본 생성자가 있어야 `Java Reflection` 을 할 수 있게해준다.
    protected Address() {

    }
}
