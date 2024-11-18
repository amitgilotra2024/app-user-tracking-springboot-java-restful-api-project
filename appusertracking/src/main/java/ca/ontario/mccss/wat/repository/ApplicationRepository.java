package ca.ontario.mccss.wat.repository;

import ca.ontario.mccss.wat.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {}
