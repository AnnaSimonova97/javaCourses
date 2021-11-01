package Lesson8.Practica;

public class User {
    private String nikName;
    private String name = "";
    private int points = 0;
    private int level = 0;
    private String pathToAvatar;

    public User() {

    }

    public User(String nikName) {
        this.nikName = nikName;
    }

    public User(String nikName, String name, int points, int level, String pathToAvatar) {
        this.nikName = nikName;
        this.name = name;
        this.points = points;
        this.level = level;
        this.pathToAvatar = pathToAvatar;
    }

    public String getNikName() {
        return nikName;
    }

    public void setNikName(String nikName) {
        this.nikName = nikName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPathToAvatar() {
        return pathToAvatar;
    }

    public void setPathToAvatar(String pathToAvatar) {
        this.pathToAvatar = pathToAvatar;
    }
}
