package com.xworkz.linkedin.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="linkedin_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkedinEntity {
    @Id
    private int id;
    private String name;
    private String email_id;
    private long phoneNumber;
}
