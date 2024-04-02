

import java.util.Scanner;



public class Factorial {
public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
    System.out.print(" N Değerini Giriniz : ");
        double n = scan.nextDouble();

    System.out.print("R Değerini Giriniz :");
        double r = scan.nextDouble();


        int nFak =1;

    for (int i= 1; i <=n; i++){

        nFak *= i;
    }

   int rFak = 1;

   for (int ii =1; ii <= r; ii++){
       rFak *=ii;
   }


   double t =n-r;
    double nEksiRfak =1;
           for(int s=1; s<=t ; s++) {
		nEksiRfak*=s;
	}

    double total = nFak/ (rFak*nEksiRfak);
    System.out.println("Kombinasyon Formülünün Sonucu : "+ total);


}
}
