package quiz;

public class Calculater {
	public static void main(String args[]){
		MyCalc mc = new MyCalc();

		while(mc.menuChoice!=5){
			mc.showMenu();
			switch(mc.menuChoice){
			case 5:break;
			case 1:mc.getNumbers();mc.addNumbers();break;
			case 2:mc.getNumbers();mc.subNumbers();break;
			case 3:mc.getNumbers();mc.multNumbers();break;
			case 4:mc.getNumbers();mc.divNumbers();break;
			default : System.out.println("please choose the menu");
			}
		}
		
	}

}
