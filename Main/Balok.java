
package Main;


public class Balok extends variabel implements MenghitungRuang {
    
 public Balok(double p,double l,double t,double r){
        super(p,l,t,r);
}

    @Override
    public void volume() {
        double v;
        v = p*l*t;
        System.out.println("Volume Balok              =   "+ v);
    }

    @Override
    public void luasPermukaan() {
      double luasBal ;
      luasBal = 2 *(p*l + p*t + l*t);
        System.out.println("Luas Permukaan Balok      =   "+ luasBal);
    }


    
}
