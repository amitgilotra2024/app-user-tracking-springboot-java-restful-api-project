package ca.ontario.mccss.wat.dto;

import java.time.OffsetDateTime;

public record AuditDTO(int auditId, Integer sessionId, String eventCd, OffsetDateTime createdOn, String pageName, String controlName, String miscDetails) {}