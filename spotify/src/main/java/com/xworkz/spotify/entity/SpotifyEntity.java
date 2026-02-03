package com.xworkz.spotify.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spotify_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpotifyEntity {
    @Id
    private int id;
    private String songName;
    private String artist;
    private long duration;
    private boolean isAvaliable;
}
