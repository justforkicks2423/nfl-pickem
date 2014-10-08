package controllers;

import org.pickem.services.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

@org.springframework.stereotype.Controller
public class Application extends Controller {

	@Autowired
	private GameRepository gameRepo;
	
    public Result index() {
        return ok(index.render());
    }

    
    public Result games() {
    	return ok(Json.toJson(gameRepo.fetchGamesByWeek()));
    }
}
