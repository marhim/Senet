package senet;

public class Player {
  private static final String[] TOKEN_TEMPLATES = {"O", "X"};
  private static int playerNumber = 1;
  private String name;
  private String token;

  public Player() {
    this("Player " + playerNumber, getNextToken());
  }

  public Player(String name) {
    this(name, getNextToken());
  }

  public Player(String name, String token) {
    this.name = name;
    this.token = token;
    playerNumber++;
  }

  private static String getNextToken() {
    return TOKEN_TEMPLATES[playerNumber % 2];
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
