import io.javalin.Javalin;

public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();

        // Define the GET endpoint
        app.get("/hello", ctx -> ctx.result("Hello World"));

        return app;
    }
}
