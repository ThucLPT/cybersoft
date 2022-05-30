package com.cybersoft.buoi20;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
	private List<Student> list = new ArrayList<>();

	@PostMapping("param")
	public List<Student> requestParam(@RequestParam("name") String name, @RequestParam("age") int age) {
		list.add(new Student(name, age));
		return list;
	}

	@PostMapping("path/{name}/{age}")
	public List<Student> pathVariable(@PathVariable("name") String name, @PathVariable("age") int age) {
		list.add(new Student(name, age));
		return list;
	}

	@PostMapping("body")
	public List<Student> requestBody(@RequestBody Student student) {
		list.add(student);
		return list;
	}
}
