package ca.ontario.mccss.wat.repository;

import jakarta.websocket.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Integer> {}
