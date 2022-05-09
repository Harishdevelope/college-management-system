package net.codejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.codejava.entity.Exams;
import net.codejava.entity.Student;
import net.codejava.service.ExamsService;
import net.codejava.service.StudentService;





@Controller
public class StudentController {
	@Autowired
	StudentService service;
	ExamsService serviceExams;
	
	//admission
	@RequestMapping("/admission")
	public String showNewProductPage(Model model)
	{
		Student student = new Student();
		model.addAttribute("student",student);
		return "admission";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("student") Student student)
	{
		service.save(student);
		return "redirect:/admission";
	}
	
	//login
	@GetMapping("/student_login")
	public String student_login() {
		return "student_login";
	}
	
	//show home page
	
	
	@RequestMapping("/Student_home")
	public String viewHomepage(Model model)
	{
		List<Student> liststudent = service.listall();
		model.addAttribute("liststudent",liststudent);
		return "Student_home";
	}
	
	
}

