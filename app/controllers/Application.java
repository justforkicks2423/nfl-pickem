package controllers;

import java.util.Arrays;

import org.pickem.services.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;

import play.libs.F.Promise;
import play.libs.ws.WS;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

@org.springframework.stereotype.Controller
public class Application extends Controller {

	@Autowired
	private GameRepository gameRepo;
	
    public Result index() {
        return ok(index.render(gameRepo.fetchGamesByWeek()));
    }

    
    public Result test() {
    	return ok();
//        return WS.url("http://www.nfl.com/ajax/scorestrip?season=2014&seasonType=REG&week=4").get().map(response -> {
//        	
//            return ok(response.getBody());
//        });
    }
}
