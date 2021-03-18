package exercise7;

public class humanWeight {

	private double weightOnEarth;
	private double weightOnMars;
	
	void setWeightOnEarth(double weight) {
		this.weightOnEarth=weight;
	}

	double getWeightOnEarth()
{
		return weightOnEarth;
}
	void setWeightOnMars(double weight)
	{
		this.weightOnMars=weight;
	}
	double getWeightOnMars()
	{
		return weightOnMars;
	}
	
	void calculateWeightOnMars(double weight)
	{
		weightOnMars=(weight/9.81)*3.711;
		
	}
}