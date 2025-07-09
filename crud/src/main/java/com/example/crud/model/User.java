package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private Long Id;
    private String name;
    private String email;

}
