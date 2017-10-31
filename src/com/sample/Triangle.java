package com.sample;

public class Triangle {

	private PointA point;

	public PointA getPoint() {
		return point;
	}

	public void setPoint(PointA point) {
		this.point = point;
	}

	public void draw() {
		System.out.println("X Axis : " + getPoint().getAxisX() + "Y Axis : " + getPoint().getAxisY());
	}
}
