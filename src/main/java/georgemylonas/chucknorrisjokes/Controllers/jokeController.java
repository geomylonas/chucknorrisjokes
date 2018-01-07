package georgemylonas.chucknorrisjokes.Controllers;

import georgemylonas.chucknorrisjokes.Services.GetJoke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jokeController {
    private GetJoke getJoke;


    @Autowired
    public jokeController(GetJoke getJoke) {
        this.getJoke = getJoke;
    }

    @RequestMapping({"/",""})
    public String print(Model model){
        model.addAttribute("joke",getJoke.recievejoke());
        return "chucknorris";
    }
}
