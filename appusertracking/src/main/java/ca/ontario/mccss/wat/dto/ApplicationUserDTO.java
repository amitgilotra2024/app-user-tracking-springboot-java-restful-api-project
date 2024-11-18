package ca.ontario.mccss.wat.dto;

import java.time.LocalDateTime;

public record ApplicationUserDTO(String userid, String emailAddress, String firstName, String lastName, LocalDateTime createdOn, LocalDateTime updatedOn) {}

