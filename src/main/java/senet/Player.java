package senet;

public class Player {
    private static int playerNumber = 1;
    private static final String[] TOKEN_TEMPLATES = {"X", "O"};
    private String name;
    private String token;

    public Player() {
        this("Player " + playerNumber, TOKEN_TEMPLATES[(playerNumber - 1) % 2]);
    }

    public Player(String name) {
        this(name, TOKEN_TEMPLATES[(playerNumber - 1) % 2]);
    }

    public Player(String name, String token) {
        this.name = name;
        this.token = token;
        playerNumber++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
