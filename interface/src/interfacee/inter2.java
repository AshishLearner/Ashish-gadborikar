package interfacee;

interface i1 {

}

interface drawable {
	void draw();
}

class rectangle implements drawable {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class circule implements drawable {
	public void draw() {
		System.out.println("drawing circule");
	}
}

class inerface {

	public static void main(String[] args) {
		rectangle r = new rectangle();
		r.draw();
		circule c = new circule();
		c.draw();

	}

}
