package ca.ontario.mccss.wat.repository;

import ca.ontario.mccss.wat.entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditRepository extends JpaRepository<Audit, Integer> {}
