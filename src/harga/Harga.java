package harga;

import java.util.Scanner;

public class Harga {

   
    public static void main(String[] args) {
        int a,b,c,d,harga;
        
        Scanner key = new Scanner(System.in);
        
        System.out.print("masukkan harga belanjaan pertama = ");
        a = key.nextInt();
         System.out.print("masukkan harga belanjaan kedua =  ");
        b = key.nextInt();
         System.out.print("masukkan harga belanjaan ketiga =  ");
        c = key.nextInt();
         System.out.print("masukkan harga belanjaan keempat =  ");
        d = key.nextInt();
        
        
        harga = a+b+c+d;
        
        if (harga >= 500000){
            System.out.println("harga yang harus dibayar = " + (harga - (harga*30/100)));
        } 
        else if(harga < 500000 && harga >= 300000){
            System.out.println("harga yang harus dibayar = " + (harga - (harga*20/100)));
        }
        else if(harga < 300000 && harga >= 150000){
            System.out.println("harga yang harus dibayar = " + (harga - (harga*10/100)));
        } else {
            System.out.println("harga yang harus dibayar = " + harga);
        }
        
        
        
       
    }
    
}
