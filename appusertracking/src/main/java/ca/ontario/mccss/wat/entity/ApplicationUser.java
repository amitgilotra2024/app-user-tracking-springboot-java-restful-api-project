package ca.ontario.mccss.wat.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ApplicationUser", schema = "dbo")
public class User {

    @Id
    @Column(name = "userId", nullable = false)
    private String userId;

    @Column(name = "emailAddress", nullable = false)
    private String emailAddress;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "createdOn", nullable = false, columnDefinition = "datetime default getdate()")
    private LocalDateTime createdOn;

    @Column(name = "updatedOn", columnDefinition = "datetime default getdate()")
    private LocalDateTime updatedOn;
}
