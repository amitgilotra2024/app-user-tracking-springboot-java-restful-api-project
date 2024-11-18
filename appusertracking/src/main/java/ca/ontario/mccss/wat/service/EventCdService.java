package ca.ontario.mccss.wat.service;

import ca.ontario.mccss.wat.dto.EventCdDTO;
import ca.ontario.mccss.wat.repository.EventCdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventCdService {
    @Autowired
    private EventCdRepository eventCdRepository;

    public List<EventCdDTO> getAllEventCds() {
        return eventCdRepository.findAll().stream()
                .map(eventCd -> new EventCdDTO(eventCd.getCode(), eventCd.getDescription(), eventCd.getDisplayOrder()))
                .toList();
    }

    // Other service methods
}
