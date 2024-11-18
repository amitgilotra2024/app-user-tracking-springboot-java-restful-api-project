package ca.ontario.mccss.wat.service;

import ca.ontario.mccss.wat.dto.AppSessionDTO;
import ca.ontario.mccss.wat.repository.AppSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppSessionService {
    @Autowired
    private AppSessionRepository appSessionRepository;

    public List<AppSessionDTO> getAllSessions() {
        return appSessionRepository.findAll().stream()
                .map(appSession -> new AppSessionDTO(appSession.getSessionId(), appSession.getUrlId(), appSession.getUserid()))
                .toList();
    }

    // Other service methods
}
