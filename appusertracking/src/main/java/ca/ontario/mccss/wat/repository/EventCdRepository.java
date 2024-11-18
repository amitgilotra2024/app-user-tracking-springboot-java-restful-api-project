package ca.ontario.mccss.wat.repository;

import ca.ontario.mccss.wat.entity.EventCd;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventCdRepository extends JpaRepository<EventCd, String> {}