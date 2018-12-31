package triangleArea;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Point v1 = null,v2=null,v3=null;
		boolean err = false;
		
		Scanner inp = new Scanner(System.in);
		
		// getting co-ordinates of three points
		System.out.println("Enter the co-ordinates seperated by space.");
		System.out.println("Enter 1st point co-ordinates");
		if(inp.hasNextInt()) {
			int x = inp.nextInt();
			if(inp.hasNextInt()) {
				int y = inp.nextInt();
				v1 = new Point(x,y);
			}else {
				err = true;
			}
		}
		System.out.println("Enter 2nd point co-ordinates");
		if(inp.hasNextInt()) {
			int x = inp.nextInt();
			if(inp.hasNextInt()) {
				int y = inp.nextInt();
				v2 = new Point(x,y);
			}else {
				err = true;
			}
		}
		System.out.println("Enter 3rd point co-ordinates");
		if(inp.hasNextInt()) {
			int x = inp.nextInt();
			if(inp.hasNextInt()) {
				int y = inp.nextInt();
				v3 = new Point(x,y);
			}else {
				err = true;
			}
		}
		inp.close();
		if(err) {
			System.out.println("Please try again with valid inputs.");
		}
		
		//finding lengths a, b and c of the triangle
		double a =new LineSegment().length(v1, v2);
		double b =new LineSegment().length(v2, v3);
		double c =new LineSegment().length(v3, v1);
		
		//s (half perimeter) of the triangle
		double s =(a+b+c)/2;
		
		//finding the area of the triangle using Heron’s Formula
		double area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(area);
		
		}
}
