package ca.ontario.mccss.wat.controller;

import ca.ontario.mccss.wat.dto.ApplicationDTO;
import ca.ontario.mccss.wat.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @GetMapping
    public List<ApplicationDTO> getAllApplications() {
        return applicationService.getAllApplications();
    }

    // Other endpoints
}
