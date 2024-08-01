package com.tekseries.employeeback.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "First_name",nullable = false)
    private String firstname;
    @Column(name = "Last_name",nullable = false)
    private String lastname;
    private String email;
}
