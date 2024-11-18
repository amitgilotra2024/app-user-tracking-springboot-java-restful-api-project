package ca.ontario.mccss.wat.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "EventCd")
public class EventCd {
    @Id
    private String code;

    private String description;
    private Integer displayOrder;

}