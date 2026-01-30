package com.xworkz.library.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="library")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibraryEntity {
    @Id
    private int id;
    private String bookName;
    private long bookNumber;
}
