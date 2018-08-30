package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Triangle implements Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }
    @Autowired
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }
    @Autowired
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }
    @Autowired
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public void draw(){
        System.out.println("Point A: " + pointA.getX()+", "+ pointA.getY());
        System.out.println("Point B: " + pointB.getX()+", "+ pointB.getY());
        System.out.println("Point C: " + pointC.getX()+", "+ pointC.getY());
    }
}
