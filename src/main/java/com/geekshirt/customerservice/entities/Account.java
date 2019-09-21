package com.geekshirt.customerservice.entities;

import com.geekshirt.customerservice.util.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "ACCOUNT")
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @OneToOne
    private Address address;
    @OneToOne
    private Customer customer;
    @OneToOne
    private CreditCard creditCard;
    @Column(name = "STATUS")
    @Enumerated(value = EnumType.STRING)
    private AccountStatus status;
}
