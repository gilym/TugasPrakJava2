
package Main;


public class Tabung extends variabel implements MenghitungRuang{
  public Tabung(double p,double l,double t,double r){
        super(p,l,t,r);
}

    @Override
    public void volume() {
        double volTabung;
        volTabung = 3.14 *r*r*t ;
        System.out.println("Volume Tabung         =   "+ volTabung);
    }

    @Override
    public void luasPermukaan() {
      double luasTabung;
      luasTabung = 2 * 3.14 * r * (r + t);
        System.out.println("Luas Permukaan Tabung =   "+ luasTabung);
    }
    
}
