package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.entity.Project;
import com.nit.service.ProjectService;
 

@Controller
public class ProjectController {

	@Autowired
	private ProjectService projectservice;
	
	
	@GetMapping(value = {"/","home"})
    public String home() {
         
		return "home"; 
}
	
	
	@GetMapping("getAllProjects")
    public String getAllProjects(Model model ) {
              
		List<Project> projects=  projectservice.geetAllProjects();
		model.addAttribute("projects",projects);

		return "projects";  
    }
	
	
	@GetMapping("addProject")
    public String addProject(Model model ) {
              
		model.addAttribute(new Project("abc"));
		return "add_project";  
    }
	
	
	@PostMapping("saveProject")
    public String saveProject	(@ModelAttribute("project") Project project ) {
		projectservice.saveProject(project);
		return "redirect:/getAllProjects";  
    }
	@PostMapping("updateProject")
    public String updateProject	(@ModelAttribute("project") Project project ) {
		projectservice.updateProject(project);
		return "redirect:/getAllProjects";  
    }
	@GetMapping("/deleteProject/{id}") // Fixed the mapping syntax
    public String deleteProject(@PathVariable(value = "id") Long id) {
        projectservice.deletePoject(id); // Corrected method name
        return "redirect:/getAllProjects";  
    }
	
	
	@GetMapping("editProject/{id}") // Fixed the mapping syntax
    public String editProject(@PathVariable(value = "id") Long id,Model model) {
		Project project= projectservice.getProject(id); // Corrected method name
        model.addAttribute(project);
		return "update_project";  
    }
}
