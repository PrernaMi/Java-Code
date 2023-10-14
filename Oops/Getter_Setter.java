package Oops;

public class Getter_Setter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pens p1 = new Pens();
		p1.setColor("Blue");
		System.out.println(p1.getColor());
		p1.setTip(5);
		System.out.println(p1.getTip());

	}

}

class Pens{
	private String color;
	private int tip;
	
	void setColor(String color) {
		this.color = color;
	}
	void setTip(int tip) {
		this.tip = tip;
	}
	String getColor() {
		return this.color;
	}
	int getTip() {
		return this.tip;
	}
	
}

