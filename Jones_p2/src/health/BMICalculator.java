package health;

import java.util.Scanner;



public class BMICalculator {
	
	/*Pseudocode 
	 * 
	 * Declare variables
	 * This code is created to calculate the BMI entered by the user and tell them there BMI Category
	 * Read in whether the user wants to use Metrics or Imperial
	 * Based on that selection prompts the user to enter the specific unit type
	 * scans in users input
	 * Calculates the users BMI based on 2 specified formulas 
	 * Displays the BMI and Category
	 * Returns and set variables in the get and set functions 
	 */
	
	private double userWeight;
	private double userHeight;
	private double BMI;
	private String bmiCategory;
	private String typeOfUnit;
	private double weight;
	private double height;
	
	
	
	public void readUserData()
	{
		readUnitType();
		readMeasurementData();
		
		
		
	}
	
	private void readUnitType()
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter whether you would like to use Metrics or Imperial");
		
		this.typeOfUnit = scan.next();
		
	
	}
	
	
	
	private void readMeasurementData()
	{
		
		
		if(this.typeOfUnit.equals("metrics"))
		{
			readMetricData();
		}
		
		else if(this.typeOfUnit.equals("imperial"))
		{
			readImperialData();
		}
	}
	
	
	private void readMetricData()
	{
		
		Scanner info = new Scanner(System.in);
		
		System.out.println("Please enter your weight in Metrics \n");
		this.userWeight = info.nextDouble();
		
		if (this.userWeight < 0)
		{
			System.exit(0);
		}
		else
		{
		System.out.println("Please enter your height in Metrics \n");
		this.userHeight = info.nextDouble();
		
		if (this.userHeight < 0)
		{
			System.exit(0);
		}
	}
		
		
	}
	
	private void readImperialData()
	{
	
		
		Scanner info = new Scanner(System.in);
		
		System.out.println("Please enter your weight in Imperial \n");
		this.userWeight = info.nextDouble();
		
		if (this.userWeight < 0)
		{
			System.exit(0);
		}
		else 
		{
		System.out.println("Please enter your height in Imperial \n");
		this.userHeight = info.nextDouble();
		
		if (this.userHeight < 0)
		{
			System.exit(0);
		}
		
		}
		
	}
	
	
	 public double calculateBMI()
	{
		 	
			
			if(this.typeOfUnit.equals("imperial"))
			{
			
			BMI = 703 * userWeight / (userHeight * userHeight);
			
			System.out.printf("Your BMI is %.2f: \n\n",BMI);
			}

		
			else if(this.typeOfUnit.equals("metrics"))
			{
		
			BMI = userWeight / (userHeight * userHeight);
		
			System.out.printf("Your BMI is %.2f: \n",BMI);
			
			
			
			}
				return BMI;
				
	}
	
	
	public void displayBMI()
	{
		
		System.out.printf("Your BMI is %.2f\n", BMI);
		
		System.out.println("BMI Categories\n");
		
		System.out.println("Underweight = <18.5\n");
		System.out.println("Normal weight = 18.5 - 24.9\n");
		System.out.println("Overweight = 25 - 29.9\n");
		System.out.println("Obesity = 30>\n");
		
		if (BMI <= 18.5)
		{
			bmiCategory = "Underweight";
			System.out.printf("Your Category is %s\n",bmiCategory);
			
		}
		else if (BMI >= 18.5 && BMI <= 24.9)
		{
			bmiCategory = "Normal weight";
			System.out.printf("Your Category is %s\n",bmiCategory);
			
		}
		else if (BMI >= 25 && BMI <= 29.9)
		{
			bmiCategory = "Overweight";
			System.out.printf("Your Category is %s\n",bmiCategory);
			
		}
		else if (BMI >= 30)
		{
			bmiCategory = "Obesity";
			System.out.printf("Your Category is %s\n",bmiCategory);
			
		}
		
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setWeight(double weight)
	{
		weight = this.userWeight;
		
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public void setHeight(double height)
	{
		height = this.userHeight;
	}
	
	public double getBMI()
	{
		return BMI;
	}
	
	public String getBMICategory()
	{
		return bmiCategory;
	}
	
	
	
	public static void main(String[] args)
	{
		BMICalculator app = new BMICalculator();
		app.readUserData();
		app.calculateBMI();
		app.displayBMI();
	}
	
}

	
	

	
