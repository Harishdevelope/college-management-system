package net.codejava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
