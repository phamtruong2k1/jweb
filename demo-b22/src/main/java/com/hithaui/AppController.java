package com.hithaui;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	
	@GetMapping(value = "/student")
	public ModelAndView btvn() {
		ModelAndView mav = new ModelAndView("Student");
		String str = "Student";
		mav.addObject("name", str);
		ArrayList<Student> list= new ArrayList<Student>();
		list.add(new Student("43","Corbin Edgington","cedgington0@tamu.edu","1596 Hoffman Terrace"));
		list.add(new Student("75", "Talbert Mulheron ","tmulheron1@fastcompany.com","119 Clove Circle"));
		list.add(new Student("49", "Pen Folkard", "pfolkard3@flavors.me","77 Stone Corner Point"));
		list.add(new Student("98", "Paulina Earp", "pearp4@weibo.com","632 Tennessee Parkway" ));
	
		mav.addObject("list",list);
		return mav;
	}
}
