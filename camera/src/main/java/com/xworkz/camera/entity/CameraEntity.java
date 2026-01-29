package com.xworkz.camera.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cameraTable")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CameraEntity {
    @Id
    private int id;
    private String productName;
    private String color;
    private float value;

}
