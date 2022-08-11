package application;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the number quantity: ");
    int n = scanner.nextInt();
    double[] vect = new double[n];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Enter a number: ");
      vect[i] = scanner.nextDouble();
    }

    double largest = 0;
    int position = 0;
    for (int i = 0; i < vect.length; i++) {
      if (vect[i] > largest) {
        largest = vect[i];
        position = i;
      }
    }

    System.out.println("Largest value: " + largest);
    System.out.println("Position: " + position);
    
    scanner.close();
  }
}
