/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int pilih;
        while(true){
            
            System.out.println("------------------------------------");
            System.out.println("INPUT");
            System.out.println("1.Balok");
            System.out.println("2.Kerucut");
            System.out.println("3.Exit");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            
            if (pilih == 1) {
                
                double panjang,lebar,tinggi;
                
                System.out.print("Panjang   : ");
                panjang = input.nextDouble();
                
                System.out.print("Lebar     : ");
                lebar = input.nextDouble();
                
                System.out.print("Tinggi    : ");
                tinggi = input.nextDouble();
                
                Balok balok = new Balok(panjang,lebar,tinggi);
                
                System.out.println("---------------OUTPUT----------------");
                System.out.println("LUAS PERSEGI            :"+balok.luas());
                System.out.println("KELILING PERSEGI        :"+balok.keliling());
                System.out.println("VOLUME BALOK            :"+balok.volume());
                System.out.println("LUAS PERMUKAAN BALOK    :"+balok.luasPermukaan());     
                
            }else if(pilih==2)
            {
                double jari,tinggi;
                
                System.out.print("Jari-Jari : ");
                jari = input.nextDouble();
                
                System.out.print("Tinggi    : ");
                tinggi = input.nextDouble();
                
                Kerucut kerucut = new Kerucut(jari,tinggi);
                
                System.out.println("---------------OUTPUT----------------");
                System.out.println("LUAS LINGKARAN          :"+kerucut.luas());
                System.out.println("KELILING LINGKARAN      :"+kerucut.keliling());
                System.out.println("VOLUME KERUCUT          :"+kerucut.volume());
                System.out.println("LUAS PERMUKAAN KERUCUT  :"+kerucut.luasPermukaan());
                
            }
            else{
                return ;
            }
        }
    }
    
}