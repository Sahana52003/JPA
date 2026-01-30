package com.xworkz.apartment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="apartment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApartmentEntity {
    @Id
    private int blocks;
    private String name;
    private double cost;
    private long mobileNumber;
}
