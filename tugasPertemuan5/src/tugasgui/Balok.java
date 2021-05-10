package tugasgui;

public class Balok extends PersegiPanjang implements MenghitungRuang{
    
    double tinggi;
    public Balok(double panjang, double lebar, double tinggi)
    {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double Volume()
    {
        double volumebalok;
        volumebalok = panjang*lebar*tinggi;
        return volumebalok;
    }
    
    @Override
    public double Luaspermukaan()
    {
        double luaspermukaanbalok;
        luaspermukaanbalok = (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
        return luaspermukaanbalok;
    }
}
