package com.shape;

public class Square implements Polygon {
	private float side;
	
	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}
	
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		float area= side*side;
		System.out.println("Area of Square is: "+area);
	}
	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		float peri = 4 * side;
		System.out.println("The Perimeter of square is: "+peri);
	}

	
}
