package com.dio.projeto.ecommerce.entities;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder
public class Shipping {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String address;

    @Column
    private String complement;

    @Column
    private String country;

    @Column
    private String state;

    @Column
    private String cep;

    @OneToOne(mappedBy = "shipping")
    private Checkout checkout;
}
