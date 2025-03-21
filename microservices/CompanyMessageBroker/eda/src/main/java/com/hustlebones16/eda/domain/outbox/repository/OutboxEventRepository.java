package com.hustlebones16.eda.domain.outbox.repository;

import com.hustlebones16.eda.domain.outbox.entity.OutboxEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutboxEventRepository extends JpaRepository<OutboxEvent, Long> {
}
