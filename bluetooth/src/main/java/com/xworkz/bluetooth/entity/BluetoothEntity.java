package com.xworkz.bluetooth.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_table")
@Data
public class BluetoothEntity {
    @Id
    private int order_id;
    private String name;
    private String address;
    private String order_item;
    private Double amount;
}
