package ca.ontario.mccss.wat.repository;

import ca.ontario.mccss.wat.entity.AppSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppSessionRepository extends JpaRepository<AppSession, Integer> {}
