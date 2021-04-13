/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
        
        Scanner sc= new Scanner(System.in);
        
        String nama, nim;
        int usia, uts, uas;
        
        System.out.println("Input data=======");
        System.out.println("NAMA    : ");
        nama = sc.nextLine();
        
        System.out.println("NIM     : ");
        nim = sc.nextLine();
        
        System.out.println("USIA    : ");
        usia = sc.nextInt();
        
        System.out.println("UTS     : ");
        uts = sc.nextInt();
        
        System.out.println("UAS     : ");
        uas = sc.nextInt();
        
        Mahasiswa mahasiswa = new Mahasiswa (nama, nim, usia, uts, uas);
        
        int pilih;
        do {
            
            System.out.println("Opsi======");
            System.out.println("1. Tampilkan data");
            System.out.println("2. Edit data");
            System.out.println("3. Exit");
            System.out.println("Pilih : ");
            pilih=sc.nextInt();
            
            if (pilih==1) {
                
                System.out.println("\n\nPerkenalkan Nama saya "
                        + mahasiswa.getName()
                        + ", nim "
                        + mahasiswa.getNim());
                System.out.println("Usia\t\t:"+mahasiswa.getUsia());
                System.out.println("NilaiAkhir\t:"+mahasiswa.getNilai());
            }
            else if(pilih==2){
                System.out.println("Edit/Input Data====");
                System.out.println("Nama\t: "); 
                nama = sc.next();
                System.out.println("NIM\t: "); 
                nim = sc.next();
                System.out.println("Usia\t: "); usia = sc.nextInt();
                System.out.println("UTS\t: "); uts = sc.nextInt();
                System.out.println("UAS\t: "); uas = sc.nextInt();
                mahasiswa = new Mahasiswa(nama,nim,usia,uts,uas);
            }
            else if (pilih==3) {
                
            }
            else{
                System.out.println("pilihan tidak tersedia");
            }
        } while (true);
        
    }
    
}
