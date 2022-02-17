package ca.sheridancollege.bask.week11.controllers;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ca.sheridancollege.bask.week11.beans.Player;
import ca.sheridancollege.bask.week11.beans.Team;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(Model model) {
		
//		model.addAttribute("year", LocalDate.now().getYear());
//		model.addAttribute("name", "Kubra Bas");
//		
		
		model.addAttribute("team", new Team("MTL", "Montreal", "Canadiens"));
		model.addAttribute("player", new Player("Carey", "Price", 31, "MTL"));
		
		ArrayList<Player> dreamTeam = new ArrayList<Player>();
		
		dreamTeam.add(new Player("Carey", "Price", 31, "MTL"));
		dreamTeam.add(new Player("Kyle", "Connor", 81, "WPG"));
		dreamTeam.add(new Player("Wayne", "Simmonds", 24, "TOR"));
		dreamTeam.add(new Player("McDavid", "Connor", 97, "EDM"));
		dreamTeam.add(new Player("Bowey", "Madison", 4, "VAN"));
		
		model.addAttribute("dreamTeam", dreamTeam);
		
		
		
		return "index.html";
	}
	
	
}
