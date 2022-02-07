package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		
	}

	public void draw()
	{	stroke(255);
		line(10,10,200,200);
		circle(200,250,50);
		ellipse(50,200,90,200);
		rectMode(CENTER);
		rect(300,20,100,20);
		rectMode(CORNER);
		rect(200,20,100,20);
		

	}
}
