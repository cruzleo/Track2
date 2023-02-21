package org.ssglobal.training.codes.shape;

import org.ssglobal.training.codes.itemA.Art;

class ShapeCreator extends Art {
	public void createSquare() {
		Square s = new Square();
		s.draw();
		s.color();
	}
	
	public void createtriangle() {
		Triangle s = new Triangle();
		s.draw();
		s.color();
	}
	
	public void createCircle() {
		Circle s = new Circle();
		s.draw();
		s.color();
	}
}
