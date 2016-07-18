import java.util.Scanner;

public class main {
	public static void main (String [] args)
	{
		Scanner kbd = new Scanner(System.in);
		//get the size of array
		System.out.println("Enter the size of a vector: ");
		int size = kbd.nextInt();
		//declare query
		double query [] = new double[size];
		//fill 
		query = fill(query);
		//normalize
		query = normalize(query);
		
		//get number of compared data 
		System.out.println("Enter the number of compared data");
		int data = kbd.nextInt();
		
		for (int i=0; i <data; i++)
		{
			//declare new array
			double array [] = new double[size];
			//fill the array
			array = fill(array);
			//normalize array
			array = normalize(array);
			//compute
			compute(query, array);
			
		}
	}
	
	public static void compute(double[] query, double [] array)
	{
		double answer = 0;
		double bottom = 0;
		double arraySum =0;
		double querySum =0;
		
		//compute the bottom
		for (int i=0 ; i< array.length;i++)
		{
			arraySum = arraySum + (array[i]*array[i]);
			querySum = querySum + (query[i]*query[i]);
		}
		bottom = Math.sqrt(arraySum)*Math.sqrt(querySum);
		
		//loop 
		for (int i=0; i< array.length; i++)
		{
			answer = answer + (array[i]*query[i]/bottom);
		}
		//print answer
		System.out.println("the answer is: " + answer);
		
	}

	public static double[] fill(double[] array)
	{
		Scanner kbd = new Scanner (System.in);
		System.out.println("Enter " + array.length + " digits to fill");
		for (int i =0; i < array.length; i++)
		{
			array[i] = kbd.nextInt();
		}
		return array;
	}
    public static void print (double [] array)
    {
    	for (double d: array)
    	{
    		System.out.println(d);
    	}
    }
    public static double [] normalize(double [] array)
    {
    	double sum = 0;
    	for (int i=0 ; i< array.length; i++)
    	{
    		sum = sum + array [i];
    	}
    	for (int i=0; i< array.length; i++)
    	{
    		array[i] = array[i]/Math.sqrt(sum);
    	}
    	return array;
    }

}
