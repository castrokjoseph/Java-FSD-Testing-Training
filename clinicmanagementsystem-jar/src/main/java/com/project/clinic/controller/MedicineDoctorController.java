 
package com.project.clinic.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.clinic.entity.Doctor;

import com.project.clinic.service.DoctorService;

@Controller
public class MedicineDoctorController {

	@Autowired
	private DoctorService dservice;

	
	@GetMapping("/addDoctorToList")
	public String addDoctorForm() {
		return "addDoctorToList";
	}

	@PostMapping("/addDoctors")
	public String doctorSave(  @ModelAttribute Doctor d, HttpSession session) {
	
		System.out.println(d);
		dservice.addDoctor(d);
		session.setAttribute("msg", "Doctor added successfully..");
		return "redirect:/showDoctor";
	}

	@GetMapping("/showDoctor")
	public String doctorView(Model m) {
		List<Doctor> doc = dservice.getAllDoctor();
		m.addAttribute("doctor", doc);
		return "showDoctor";
	}

	@GetMapping("/updateDoctorList/{did}")
	public String doctorEdit(@PathVariable String did, Model m2) {

		Doctor d = dservice.getDoctorById(did);
		m2.addAttribute("doctor", d);
		return "updateDoctorList";
	}

	@PostMapping("/updateDoctors")
	public String doctorUpdate(@ModelAttribute Doctor d, HttpSession session) {

		dservice.addDoctor(d);
		session.setAttribute("msg", "Doctor updated successfully..");
		return "redirect:/showDoctor";
	}

	@GetMapping("/dropDoctor/{did}")
	public String medDelete(@PathVariable String did, HttpSession session) {
		dservice.deleteDoctor(did);
		session.setAttribute("msg", "Doctor deleted successfully..");
		return "redirect:/showDoctor";
	}

}
