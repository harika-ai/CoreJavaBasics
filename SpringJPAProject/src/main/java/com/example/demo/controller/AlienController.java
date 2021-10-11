package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Alien;
import com.example.demo.repo.AlienRepo;

@Controller
//instead of controller restcontroller which is used to work for json,xml format return reposnbody
@RestController
public class AlienController {

	@Autowired
	AlienRepo repo;

	@RequestMapping("/home")
	public String home() {
		return "Index.jsp";
	}

	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "Index.jsp";
	}

	@PostMapping(path = "/addaliens", consumes = { "application/json" })
	public Alien addAlienPost(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}

	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("showalien.jsp");
		Alien alien = repo.findById(aid).orElse(new Alien());
		// optional to handle null values
		System.out.println(repo.findByTech("javaa"));
		System.out.println(repo.findByAidGreaterThan(1));
		System.out.println(repo.findByTechSorted("javaa"));
		mv.addObject(alien);
		return mv;
	}

//server accepting the request from client consumesend the data to client then we need to use consume for post mapping
	// @RequestMapping(path = "/aliens", produces = {"application/xml"})
	// @ResponseBody
	@GetMapping(path = "/aliens", produces = { "application/json" })
	public List<Alien> getAllAlien() {
		// return repo.findAll().toString();
		return repo.findAll();
	}

	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public Optional<Alien> getAliens(@PathVariable("aid") int aid) {
		// return repo.findById(102).toString();
		return repo.findById(aid);
	}

	// jackson is responsible convert object into json format
	// send the data to the client by using postman based on required format--
	@DeleteMapping("/aliens/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		Alien a = repo.getOne(aid);
		repo.delete(a);
		return "deleted";

	}

	@PutMapping(path = "/addaliens", consumes = { "application/json" })
	public Alien updateAlienPost(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}

}
