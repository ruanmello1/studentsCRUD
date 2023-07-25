package br.com.rm.sbwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.rm.sbwebapp.entity.Student;
import br.com.rm.sbwebapp.repository.StudentRepository;

@SpringBootApplication
public class SbwebappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SbwebappApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Ruan", "Mello", "ruan_mello1@hotmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Lucas", "Silva", "lucas@lucas.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Letícia", "Vieira", "leticia@leticia.com");
		 * studentRepository.save(student3);
		 */
	}

}
