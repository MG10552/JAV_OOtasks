class wielokat
{
	//boki, coordinates, pole, obwod, 
}
class site<x,y,L>
{
	double x,y;
	double edgecoordinates(x,y);
	double sitelen; //L
	
}

class line
{
	//double edgecoordinates(x,y); ????
	double sitelen(){}
}

class circle
{
	static double r;
	double obwod(double O,double r)
	{
	O = 2*Math.PI*r;	
	} //2*Math.PI*r
	double pole(double P, double r)
	{
		P = Math.PI*(r*r);
	}  //Math.PI*r^2
	double sitelen(){}
	
}

class triangle
{
	static double a, b, c; 
	double obwod(double O double a, double b, double c)
	{
		O = a+b+c;
	} //a+b+c
	double pole(double P)
	{
		P = Math.sqrt(obwod()*(obwod()-a)*(obwod()-b)*(obwod()-c))
	} // Math.sqrt(obwod*(obwod-a)*(obwod-b)*(obwod-c))
	
	double site(){} //a, b, c
	double sitelen(){}
	double sitesnum(){} //3
}

class square
{
	static double d;
	double obwod(){} //4*d
	double pole(){} //d*d
	
	double site(){}//d
	double sitelen(){} //d x 4
	double sitesnum(){} // 4
}

public class FGMain {

	public static void main(String[] args)
	{
		//line(edgecoordinates, sitelen)
		//circle(obwod, pole, r)
		//triangle(obwod, pole, a, b, c) 
		//square(obwod, pole, d)
		
	}
	
}
