import java.util.Arrays;


public class wektor {
	private double[] tab;
	public wektor(double n)
	{
	int[] tab;
	tab = new int[n];
	}
	
	
public double getIty(double tab)
{
return tab;
}

public double setIty(double i)
{
 this.tab = tab;
}

public double getMAX(double[] najwiekszy) 
{
	double max = najwiekszy[0];  
	for (int i = 1; i < najwiekszy.length; i++) {
	if (najwiekszy[i] > max)
	max = najwiekszy[i];  
}
	return max;
	}
public double getMINI(double[] najmniejszy)
{
	double mini = najmniejszy[0];  
	for (int i = 1; i < najmniejszy.length; i++) {
	if (najmniejszy[i] < mini)
	mini = najmniejszy[i];  
}
	return mini;
	}


public double getAdd(double x, y) 
{
	V3.x = V1.x + V2.x;
	V3.y = V1.y + V2.y;
	}
public double getSize() 
{
    return tab.length;
	}
public String toString()
{
	return double.toString
	}
void show(double[] linia)
{
	System.out.println(linia);
}

public void sortowanie()
{
    Arrays.sort(tab);
    for(int i=0;i<10;i++)
    {
        System.out.println(tab[i]);
    }
}





}
