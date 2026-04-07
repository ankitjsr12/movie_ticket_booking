package com.bwu.moviebooking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "movies")
@Data
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;
    private String description;
    private String poster;        // you can put image URL or emoji
    private int duration;         // in minutes
}
