
package Main;
import java.util.Scanner;
public class Main {

    /*
    Author Gilang Yoenal Marinta
    NIM 123200056
    Plug If-E Praktikum PBO
    */
   
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int temp,temp1;
        do{
            
            System.out.println("------------------------------");
        System.out.println("1.Persegi Panjang dan Balok");
        System.out.println("2.Lingkaran dan Tabung");
        System.out.println("3.Exit");
        System.out.println("------------------------------");
        System.out.print("Input Menu     : ");int pil = Input.nextInt();
      temp= pil;
      
       
        switch(pil){
            case 1 :do{
                    System.out.println("------------------------------");
                    System.out.println("Persegi Panjang dan Balok");
                    System.out.println("------------------------------");
                    System.out.print("Input Panjang : "); double panjang = Input.nextDouble();
                    System.out.print("Input Lebar   : ")  ;double lebar = Input.nextDouble();
                    System.out.print("Input Tinggi  : ") ;double tinggi = Input.nextDouble();
                    Balok balok = new Balok (panjang , lebar , tinggi , 0);
                    PersegiPanjang persegi = new PersegiPanjang (panjang , lebar , tinggi , 0);
                    System.out.println("------------------------------");
                    System.out.println("Persegi Panjang");
                    System.out.println("------------------------------");
                    persegi.keliling();
                    persegi.luas();
                    System.out.println("------------------------------");
                    System.out.println("Balok");
                     System.out.println("------------------------------");
                    balok.luasPermukaan();
                    balok.volume();
                    System.out.println("------------------------------\n\n");
                    System.out.print("Apakah Ingin mengulang Perhitungan ? (Yes = 1 | No = 0) :  " ); int ulang = Input.nextInt();
                    temp1=ulang;
                    }while( temp1 == 1);
                    break;
                    
            case 2 :do{
                    System.out.println("------------------------------");
                    System.out.println("Persegi Panjang dan Balok");
                    System.out.println("------------------------------");
                    System.out.print("Input Jari-Jari : "); double jari = Input.nextDouble();
                    System.out.print("Input Tinggi  : ") ;double tinggi1 = Input.nextDouble();
                    Tabung tabung = new Tabung (0,0,tinggi1,jari);
                    Lingkaran lingkaran = new Lingkaran (0,0,tinggi1,jari);
                    System.out.println("------------------------------");
                    System.out.println("Lingkaran");
                    System.out.println("------------------------------");
                    lingkaran.keliling();
                    lingkaran.luas();
                    System.out.println("------------------------------");
                    System.out.println("Tabung");
                    System.out.println("------------------------------");
                    tabung.luasPermukaan();
                    tabung.volume();
                    System.out.println("------------------------------\n\n");
                    System.out.print("Apakah Ingin mengulang Perhitungan ? (Yes = 1 | No = 0) :  " ); int ulang = Input.nextInt();
                    temp1=ulang;
                    }while(temp1==1);
                    break;
                    
            case 3 : System.out.println("Terima Kasih :) ");break;
            
                    
                    
            default : System.out.println("Mohon Maaf Pilihan Tidak Tersedia");
        }
        }while(temp !=3);
        
    }
    
}
