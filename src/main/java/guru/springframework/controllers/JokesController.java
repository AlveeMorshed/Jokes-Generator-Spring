package guru.springframework.controllers;

import guru.springframework.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""} )
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "index"; //html page name as String
    }
}
