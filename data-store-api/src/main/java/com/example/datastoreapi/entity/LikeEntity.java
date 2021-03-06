package com.example.datastoreapi.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "likes")
public class LikeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String likeId;


    private String merchId;

    @NotNull
    private String userId;
}

