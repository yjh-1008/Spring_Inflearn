package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Locker {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="LOCKER_NAME")
    private String name;
}
