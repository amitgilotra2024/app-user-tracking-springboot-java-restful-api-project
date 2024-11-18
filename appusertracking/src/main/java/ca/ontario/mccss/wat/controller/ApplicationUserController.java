package ca.ontario.mccss.wat.controller;

import ca.ontario.mccss.wat.dto.UserDTO;
import ca.ontario.mccss.wat.service.ApplicationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private ApplicationUserService applicationUserService;

    @GetMapping
    public List<UserDTO> getAllUsers() {

        return applicationUserService.getAllUsers();
    }
}
