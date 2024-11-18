package ca.ontario.mccss.wat.service;

import ca.ontario.mccss.wat.dto.AuditDTO;
import ca.ontario.mccss.wat.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditService {
    @Autowired
    private AuditRepository auditRepository;

    public List<AuditDTO> getAllAudits() {
        return auditRepository.findAll().stream()
                .map(audit -> new AuditDTO(audit.getAuditId(), audit.getSessionId(), audit.getEventCd(), audit.getCreatedOn(), audit.getPageName(), audit.getControlName(), audit.getMiscDetails()))
                .toList();
    }

    // Other service methods
}