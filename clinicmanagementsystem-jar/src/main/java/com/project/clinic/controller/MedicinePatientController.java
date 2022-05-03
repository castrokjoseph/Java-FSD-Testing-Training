
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

import com.project.clinic.entity.Patient;

import com.project.clinic.service.PatientService;

@Controller
public class MedicinePatientController {

	@Autowired
	private PatientService pservice;

	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/ReportNow")
	public String report() {
		return "ReportNow";
	}
	@GetMapping("/Assistance")
	public String asisst() {
		return "Assistance";
	}

	@GetMapping("/addPatientToList")
	public String addPatientForm() {
		return "addPatientToList";
	}

	@PostMapping("/addPatients")
	public String patientSave(  @ModelAttribute Patient p, HttpSession session) {
	
		System.out.println(p);
		pservice.addPatient(p);
		session.setAttribute("msg", "Patient added successfully..");
		return "redirect:/showPatient";
	}

	@GetMapping("/showPatient")
	public String patientView(Model m) {
		List<Patient> pat = pservice.getAllPatient();
		m.addAttribute("patient", pat);
		return "showPatient";
	}

	@GetMapping("/updatePatientList/{pid}")
	public String patientEdit(@PathVariable String pid, Model m2) {

		Patient p = pservice.getPatientById(pid);
		m2.addAttribute("patient", p);
		return "updatePatientList";
	}

	@PostMapping("/updatePatients")
	public String patientUpdate(@ModelAttribute Patient p, HttpSession session) {

		pservice.addPatient(p);
		session.setAttribute("msg", "Patient updated successfully..");
		return "redirect:/showPatient";
	}

	@GetMapping("/dropPatient/{pid}")
	public String medDelete(@PathVariable String pid, HttpSession session) {
		pservice.deletePatient(pid);
		session.setAttribute("msg", "Patient deleted successfully..");
		return "redirect:/showPatient";
	}

}
