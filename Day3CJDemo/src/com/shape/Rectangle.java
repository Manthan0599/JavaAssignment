package com.shape;

public class Rectangle implements Polygon {
	private float length;
	private float breadth;
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		float area = length * breadth;
		System.out.println("The Area of Rectangle is: "+area);
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		float peri = (2 * length) + (2 * breadth);
		System.out.println("The Perimeter of Rectangle is: "+peri);
	}

	

}
