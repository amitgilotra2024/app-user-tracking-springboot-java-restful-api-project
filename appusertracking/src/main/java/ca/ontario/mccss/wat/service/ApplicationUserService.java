package ca.ontario.mccss.wat.service;

import ca.ontario.mccss.wat.dto.UserDTO;
import ca.ontario.mccss.wat.entity.User;
import ca.ontario.mccss.wat.exception.UnauthorizedException;
import ca.ontario.mccss.wat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> new UserDTO(
                        user.getUserId(),
                        user.getEmailAddress(),
                        user.getFirstName(),
                        user.getLastName(),
                        user.getCreatedOn(),
                        user.getUpdatedOn()))
                .toList();
    }

    public User getAppUserInfo(String oid) {
        Optional<User> user = userRepository.findByUserId(oid);

        if (user.isEmpty()) { // Check if the Optional is empty
            throw new UnauthorizedException("User with OID '" + oid + "' does not exist or is invalid.");
        }

        return user.get(); // Retrieve the value from Optional
    }
}
