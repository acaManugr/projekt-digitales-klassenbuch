package com.example.digitalesklassenbuch.repository;

import com.example.digitalesklassenbuch.entity.Wochentag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WochentagRepository extends JpaRepository<Wochentag, Long> {
}
