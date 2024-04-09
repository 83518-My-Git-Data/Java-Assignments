package com.app.geometry;

import java.lang.Math;

public class Point2D {
	private double x;
	private double y;

	public Point2D() {

	}

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;

	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getDetails() {
		String res = "Point (" + x + "," + y + ")"; 
		return res;
	}

	public boolean isEqual(Point2D p) {
		if (this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}

	public double calcualateDistance(Point2D p2) {
		return Math.sqrt(Math.pow((this.x - p2.x), 2) + Math.pow((this.y - p2.y), 2));

	}

}
