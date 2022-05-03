package Task2;

public class Rialto {
    String[] rialto;
    public Rialto(int n){
        rialto= new String[n];
        for (int i =0;i < rialto.length; i++){
            rialto[i]= Rounder.roundValue(10 + Math.random()*1000)+"$";
        }
    }
}
