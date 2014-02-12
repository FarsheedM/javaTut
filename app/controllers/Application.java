package controllers;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("sinaaps is here!"));
    }
    
    public static Result show(String name) {
        return ok("Hello Bob!" + name);
    }

}
