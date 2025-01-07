package calc;



public class Calculadora {
    private double n1;
    private double n2;
    private double res;
    public Calculadora(){
    }
    public double soma(){
        return n1+n2;
    }
    public double sub(){
        return n1-n2;
    }
    public double mult(){
        return n1*n2;
    }
    public double divisao(){
        return n1/n2;
    }
    public double getN1() {
        return n1;
    }
    public double getN2() {
        return n2;
    }
    public double getRes() {
        return res;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
   
    

}
