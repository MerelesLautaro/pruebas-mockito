package org.example.model;

public class Player {
    private Long id;
    private String name;
    private String team;
    private String position;

    public Player() {
    }

    public Player(Long id, String name, String position, String team) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                "name='" + name + '\'' +
                "team='" + team + '\'' +
                "position='" + position + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
