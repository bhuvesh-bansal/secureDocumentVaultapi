package com.securevault.documentvault;

import com.securevault.documentvault.model.TestEntity;
import com.securevault.documentvault.repository.TestEntityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {

    private final TestEntityRepository repo;

    public StartupRunner(TestEntityRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        TestEntity entity = new TestEntity();
        entity.setName("Sample Entry");

        repo.save(entity);  // This will trigger an INSERT SQL
        System.out.println("Total records in DB: " + repo.count());  // This will trigger SELECT COUNT
    }
}
