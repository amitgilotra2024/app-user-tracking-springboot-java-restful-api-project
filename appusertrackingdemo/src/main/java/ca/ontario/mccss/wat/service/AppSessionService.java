package ca.ontario.mccss.wat.service;

import ca.ontario.mccss.wat.dto.SessionDTO;
import ca.ontario.mccss.wat.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {
    @Autowired
    private SessionRepository sessionRepository;

    public List<SessionDTO> getAllSessions() {
        return sessionRepository.findAll().stream()
                .map(session -> new SessionDTO(session.getId(), session.getUrl(), session.getUserId()))
                .toList();
    }

    // Other service methods
}
