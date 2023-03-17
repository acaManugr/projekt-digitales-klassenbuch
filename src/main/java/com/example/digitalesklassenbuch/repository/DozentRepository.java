package com.example.digitalesklassenbuch.repository;

import com.example.digitalesklassenbuch.entity.Dozent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DozentRepository extends JpaRepository<Dozent, Long> {
}
