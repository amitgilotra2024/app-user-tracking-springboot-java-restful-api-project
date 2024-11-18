package ca.ontario.mccss.wat.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Session")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sessionId;

    private int urlId;
    private String userid;

}