package behavior.chainOfResponsibility;

/**
 * Created by vorh on 7/18/17.
 */
public class Demo {

    public static void main(String[] args) {

        Server server = new Server();
        server.register("test@test.com", "123");
        server.register("admin@test.com", "1234");


        Middleware middleware = new ThrottlingMiddleware(3);
        middleware.linkWith(new UserExistMiddleware())
                .linkWith(new PasswordCheckMidleware())
                .linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middleware);

        server.logIn("test@test.com", "321321");
        server.logIn("test@test.com", "123");
        server.logIn("admin@test.com", "1234");

    }
}
