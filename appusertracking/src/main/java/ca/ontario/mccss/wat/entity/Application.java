package ca.ontario.mccss.wat.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "Application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int urlId;

    private String name;
    
}


