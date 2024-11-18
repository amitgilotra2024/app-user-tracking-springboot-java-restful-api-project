package ca.ontario.mccss.wat.repository;

import ca.ontario.mccss.wat.entity.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

@Query(value = "SELECT * FROM dbo.ApplicationUser WHERE userId = :userId", nativeQuery = true)
Optional<ApplicationUser> findByUserId(@Param("userId") String userId);

