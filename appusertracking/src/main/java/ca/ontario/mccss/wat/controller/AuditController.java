package ca.ontario.mccss.wat.controller;


import ca.ontario.mccss.wat.dto.AuditDTO;
import ca.ontario.mccss.wat.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/audits")
public class AuditController {
    @Autowired
    private AuditService auditService;

    @GetMapping
    public List<AuditDTO> getAllAudits() {
        return auditService.getAllAudits();
    }

    // Other endpoints
}