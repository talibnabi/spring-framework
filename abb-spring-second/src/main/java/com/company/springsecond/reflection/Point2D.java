package com.company.springsecond.reflection;

public class Point2D {
    private Integer x;
    private Integer y;

    private String z;

    public Point2D(Integer x, Integer y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point2D(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(Integer y, String z) {
        this.y = y;
        this.z = z;
    }

    public Point2D(Integer x) {
        this.x = x;
    }

    public Point2D(String z) {
        this.z = z;
    }

    public Point2D() {

    }

    @Override
    public String toString() {
        return String.format("[%d : %d : %s]", x, y,z);
    }
    public void printMe(){
        System.out.println(this);
    }
}
