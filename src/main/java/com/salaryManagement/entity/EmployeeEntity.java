package com.salaryManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/18/20 5:43 PM
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String designation;

    @NotNull
    @Column(columnDefinition = "TEXT")
    private String address;

    @NotNull
    private String phone;

    @NotNull
    private long salary;

    @NotNull
    private long bankAccount;

}
