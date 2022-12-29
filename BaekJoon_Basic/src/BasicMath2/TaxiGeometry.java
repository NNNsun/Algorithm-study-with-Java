package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxiGeometry {
	
	public static void main(String[] args) throws IOException {
		System.out.println("½ÇÇà");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		double n=Double.parseDouble(br.readLine());
		System.out.println(getEuclid(n));
		System.out.println(getTaxi(n));
	}
	public static double getTaxi(double i) {
		if (i<0) i=i*-1;
		return 2*i*i;
	}
	public static double getEuclid(double i) {
		if (i<0) i=i*-1;
		return i*i*Math.PI;
	}
}
