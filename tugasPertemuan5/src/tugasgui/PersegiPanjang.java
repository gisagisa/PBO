package tugasgui;

public class PersegiPanjang implements MenghitungBidang
{
    public double panjang;
    public double lebar;
    
    public PersegiPanjang(double panjang, double lebar)
    {    
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double Luas()
    {
        return panjang*lebar;
    }
       
    @Override
    public double Keliling()
    {
        return 2*panjang+2*lebar;
    }
}
