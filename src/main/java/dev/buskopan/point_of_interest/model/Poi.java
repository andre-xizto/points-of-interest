package dev.buskopan.point_of_interest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "poi")
public class Poi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double x;
    private double y;

    public Poi(String name, double x, double y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public Poi() {
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{name="+name+",x="+x+",y="+y+"}";
    }
}

