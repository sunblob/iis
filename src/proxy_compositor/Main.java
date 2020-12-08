package proxy_compositor;

public class Main {

    public static void main(String[] args) {
        Team team = new Team();

        FrontendDeveloper frontendDeveloper = new FrontendDeveloper();
        BackendDeveloper backendDeveloper = new BackendDeveloper();

        frontendDeveloper.doWork();

        team.add(frontendDeveloper);
        team.add(backendDeveloper);

        team.doWork();
    }
}
