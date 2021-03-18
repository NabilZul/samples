package exercise8;
import java.util.Scanner;
public class Main8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("How many human on the list: ");
		int humanNumber=sc.nextInt();
		
		humanList humans= new humanList();
		HumanWeight[] human = new HumanWeight[humanNumber];
		for(int i =0;i<humanNumber;i++)
		{
			human[i]= new HumanWeight();
			System.out.print("\ninsert yout weight in KG:");
			double weight = sc.nextDouble();
			human[i].setWeightOnEarth(weight);
			
			human[i].calculateWeightOnMars(weight);
			humans.people.add(human[i]);
		}
		for(int i =0; i<humans.people.size();i++)
		{
			System.out.println("Human"+i+ "weight on earth is:"+humans.people.get(i).getWeightOnEarth()+"KG");
			System.out.println("Human"+i+ "weight on mars is:"+humans.people.get(i).getWeightOnMars()+"KG");
		}
		sc.close();
	}}
			
			
