package controllers;

import play.mvc.*;
import play.mvc.Http.Cookie;
import play.mvc.Http.Cookie.SameSite;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    /*@Deprecated*/
    public static Http.Cookie builder(java.lang.String name,
                                      java.lang.String value,
                                      java.lang.Integer maxAge,
                                      java.lang.String path,
                                      java.lang.String domain,
                                      boolean secure,
                                      boolean httpOnly,
                                      Http.Cookie.SameSite STRICT)
    {
        return builder("clientCook", "blue", Duration.ofSeconds(3600), "/index", "localhost:9000", false, true);
    }

    public Result index() {
        response().setHeader(CACHE_CONTROL, "max-age=3600");
        response().setHeader(ETAG, "xxx");





        return ok("<h1>Hello World</h1>").as("text/html");
    }

}
