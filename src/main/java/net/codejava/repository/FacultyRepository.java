package net.codejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

}
