
public class PheaseDelay {
	/*
	 * klasa odpowiadaj�ca za obliczanie przesuniecia fazy w punkcie
	 *  oraz sinusy i ich sume
	 * 
	 */
	static double phi = 0; 
	static double yy = 0; // punkt na ekranie
	static double dd = 0; // rozstaw otwor�w
	static double lambda = 1; //dlugosc fali
	static double xx = 0; // odleglosc od ekranu
	static double A1 = 1;
	static double A2 = 1;
	static double Iy = 0;
	static double r1;
	static double r2;
	//int c = 299792458
	static int l = 50; // rozdzielczosc wykresow
	double[] sin1;
	double[] sin2;
	double[] sumSin;
	
	public static void setY(double y)
	{
		yy = y;
	}
	
	public static void setX(double x)
	{
		xx = x;
	}
	
	public static void setD(double d)
	{
		dd = d;
	}
	
	public static void setL(double l)
	{
		lambda = l;
	};
	
	public static double getY()
	{
		return yy;
	}
	
	public static double getX()
	{
		return xx;
	};
	
	public static double getD()
	{
		return dd;
	}
	
	public static double getL()
	{
		return lambda;
	}
	
	static double getR1() //metoda zwracająca odległosc punktu na ekranie od szczeliny nr 1 
	{
		r1 = Math.sqrt( Math.pow(yy+dd,2) + Math.pow(xx,2));
		return r1;
	};
	
	static double getR2()  //metoda zwracająca odległosc punktu na ekranie od szczeliny nr 1 
	{
		r2 = Math.sqrt( Math.pow(yy-dd,2) + Math.pow(xx,2));
		return r2;
	};
	
	static double getPhease() //zwraca przesuniecie fazy
	{
		double dif = Math.abs(getR1()-getR2());
		phi = (dif % lambda)/lambda * 2 * Math.PI;
		return phi;
		
	};
	
	static double getI() //zwraca natezenie w punkcie
	{
		Iy = Math.pow(A1/r1,2) + Math.pow(A2/r2,2) + 2*A1*A2/r1/r2*Math.cos(getPhease());
		return Iy;
	};
	
	static int getNMax(double n)
	{
		int y = (int) (xx * Math.tan(Math.sinh(n*lambda/dd)));
		return y;
		
	};
	/*void set(double y1, double d1, double lambda1, double h1, int l1)
	{
		yy = y1;
		dd = d1;
		lambda = lambda1;
		xx=h1;
		l = l1;
	};*/
	
	void sinusy() //liczy sinusy i ich sume dla jednego okresu
	{
		for(int ii = 0; ii<l; ii++)
		{
			sin1[ii] = Math.sin(ii/l*2* Math.PI);
			sin2[ii] = Math.sin(ii/l*2* Math.PI + phi);
			sumSin[ii] = sin1[ii]+sin2[ii];
		}
		
	}


	
	/*
	public PheaseDelay() {
		sin1 = new double[50];
		sin2 = new double[50];
		sumSin = new double[50];
	}*/

}
