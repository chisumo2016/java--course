package method;

class Computer {
	

	public void playMusic() {
		System.out.println("Music Playing .....");
	}
	
	public String getMeAPen(int cost) {
		
		if(cost >=10)
			
		return "Pen";
		
		else
			return "Nothing";
	}

}

public class Demo {
	
	public static void main(String[] args) {
		
		Computer comp = new Computer();
		
		comp.playMusic();
		String str = comp.getMeAPen(45);
		System.out.println(str);
		
	}

}

