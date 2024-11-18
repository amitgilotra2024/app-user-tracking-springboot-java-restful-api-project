package ca.ontario.mccss.wat.controller;

import ca.ontario.mccss.wat.dto.EventCdDTO;
import ca.ontario.mccss.wat.service.EventCdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event-cds")
public class EventCdController {
    @Autowired
    private EventCdService eventCdService;

    @GetMapping
    public List<EventCdDTO> getAllEventCds() {
        return eventCdService.getAllEventCds();
    }

    // Other endpoints
}