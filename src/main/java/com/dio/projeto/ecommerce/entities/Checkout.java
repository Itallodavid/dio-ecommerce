package com.dio.projeto.ecommerce.entities;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder
public class Checkout {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String code;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Column
    private Boolean saveAddress;

    @Column
    private Boolean saveInformation;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime updatedAt;

    @OneToOne(cascade = CascadeType.ALL)
    private Shipping shipping;

    @OneToMany(mappedBy = "checkout", cascade = CascadeType.ALL)
    private List<CheckoutItem> items;

    public enum Status {
        CREATED,
        APPROVED
    }
}
