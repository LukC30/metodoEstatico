package application;

import java.util.Scanner;
import util.Calculator;

public class Main {

	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter radius");
		double radius = scan.nextDouble();
		
		double circunferencia = Calculator.circunferencia(radius);
		
		double volume = Calculator.volume(radius);
		
		System.out.printf("Seu raio foi: %.2f%nA circunferencia foi: %.3f%nE o volume desse circulo é: %.2f%nE PI representa: %.2f", radius, circunferencia, volume, Calculator.PI);
	}
	
}
