package com.ocp.day16;

public class CicleAreaImpi implements CircleArea {

    @Override
    public double getArea(double r) {
        return r * r * Math.PI;
    }
}
