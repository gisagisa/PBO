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
public class PersegiPanjang implements MenghitungBidang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
    
    @Override
    public double luas() {
        double luas;
        luas = this.panjang*this.lebar;
        return luas;
    }

    @Override
    public double keliling() {
        double keliling;
        keliling = (2*this.panjang)+(2*this.lebar);
        return keliling;
    }
    
}
