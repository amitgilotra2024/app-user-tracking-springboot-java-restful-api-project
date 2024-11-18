package ca.ontario.mccss.wat.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;

@Entity
@Data
@Table(name = "Audit")
public class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int auditId;

    private Integer sessionId;
    private String eventCd;
    private OffsetDateTime createdOn;
    private String pageName;
    private String controlName;
    private String miscDetails;

}
