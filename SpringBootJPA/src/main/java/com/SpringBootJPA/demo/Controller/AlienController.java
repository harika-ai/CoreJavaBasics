package com.SpringBootJPA.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.SpringBootJPA.demo.Model.Alien;
import com.SpringBootJPA.demo.dao.AlienRepo;

@RestController
//@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}

	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aId) {
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		// Optional<Alien> alien=repo.findById(aId);
		Alien alien = repo.findById(aId).orElse(new Alien());
		System.out.println(repo.findByTech("java"));
		// System.out.println(repo.findByGreaterThan(90));
		// System.out.println(repo.findByTechSorted("java"));
		mv.addObject("obj", alien);
		return mv;
	}

	// produces usess to specify the input data format as appication/xml
	// @RequestMapping(path="/aliens",produces="application/json")
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens() {
		return repo.findAll();
		// return repo.findAll().toString();
	}

	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlienById(@PathVariable("aid") int aid) {
		return repo.findById(aid);
		// return repo.findById(aid).toString();
	}

	@PostMapping(path = "/addAlien1")
	public Alien addAlien1(Alien alien) {

		return repo.save(alien);
	}

	@DeleteMapping("/deleteAlien")
	public void deleteAlien(Alien alien) {

		repo.delete(alien);
	}

	@PutMapping("/modifyAlien")
	public List<Alien> updateAlien(String tech) {

		List<Alien> aliens = repo.findByTech("java");
		for (int i = 0; i < aliens.size(); i++) {
			Alien alien1 = aliens.get(i);
			alien1.setTech("java");
			repo.save(alien1);
			aliens.add(alien1);
		}
		return aliens;
	}
}
