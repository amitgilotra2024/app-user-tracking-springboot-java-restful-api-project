package ca.ontario.mccss.wat.service;

import ca.ontario.mccss.wat.dto.ApplicationDTO;
import ca.ontario.mccss.wat.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public List<ApplicationDTO> getAllApplications() {
        return applicationRepository.findAll().stream()
                .map(app -> new ApplicationDTO(app.getUrlId(), app))
                .toList();
    }

    // Other service methods
}