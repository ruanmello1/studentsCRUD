package br.com.rm.sbwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rm.sbwebapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
