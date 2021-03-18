package exercise7;
import java.util.Scanner;
public class main7 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		humanWeight human = new humanWeight();
		
		System.out.print("\ninsert yout weight in KG:");
		double weight = sc.nextDouble();
		human.setWeightOnEarth(weight);
		
		human.calculateWeightOnMars(weight);
		System.out.println("\nYour weight on earth is:"+human.getWeightOnEarth()+"KG");
		System.out.println("\nYour weight on mars is:"+human.getWeightOnMars()+"KG");
	}

}
