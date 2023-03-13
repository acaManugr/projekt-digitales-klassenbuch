package com.example.digitalesklassenbuch.repository;

import com.example.digitalesklassenbuch.entity.Eintrag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EintragRepository extends JpaRepository<Eintrag, Long> {
}
