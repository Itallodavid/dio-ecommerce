package com.dio.projeto.ecommerce.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder
public class CheckoutItem {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String product;

    @ManyToOne
    private Checkout checkout;
}
