package ca.ontario.mccss.wat.controller;

import ca.ontario.mccss.wat.dto.AppSessionDTO;
import ca.ontario.mccss.wat.service.AppSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sessions")
public class AppSessionController {
        @Autowired
        private AppSessionService appSessionService;

        @GetMapping
        public List<AppSessionDTO> getAllSessions() {
            return appSessionService.getAllSessions();
        }

        // Other endpoints
    }