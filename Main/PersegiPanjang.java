
package Main;


public class PersegiPanjang extends variabel implements MenghitungBidang{

    public PersegiPanjang(double p,double l,double t,double r){
        super(p,l,t,r);
}

    @Override
    public void luas() {
        double luasPersegiPanjang;
        luasPersegiPanjang = p * l ;
        System.out.println("Luas Persegi Panjang      =   "+ luasPersegiPanjang);
    }

    @Override
    public void keliling() {
        double kelPersegiPanjang;
        kelPersegiPanjang = 2 *(p + l);
        System.out.println("Keliling Persegi Panjang  =   " + kelPersegiPanjang);
    }
}