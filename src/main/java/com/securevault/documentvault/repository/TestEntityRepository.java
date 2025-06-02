package com.securevault.documentvault.repository;

import com.securevault.documentvault.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestEntityRepository extends JpaRepository<TestEntity, Long> {
}
