
public class Automobile extends Thread
{
    public static int giriMax;
    public static double tMin;
    public static double tMax;
    public static int macchineArrivate = 0;
    private int numero;
    private int giriCompletati = 0;
    private double tTot = 0;
    
    public Automobile(int numero)
    {
        this.numero = numero;
    }
    
    public void run() {
        for (int i = 0; i < giriMax; i++) {
            double t = (double)Math.round((Math.random() * (tMax - tMin) + tMin)*1000.0)/1000.0;
            try{
                sleep((int)t*1000);
            } catch(Exception e) {}
            giroCompletato(t);
            tTot += t;
        }
        garaCompletata();
    }
    
    public void giroCompletato(double t) {
        giriCompletati += 1;
        System.out.println("macchina " + numero + " giro " + giriCompletati + " in " + t);
    }
    
    public void garaCompletata() {
        macchineArrivate += 1;
        System.out.println("macchina " + numero + " arriva " + macchineArrivate + " in " + tTot);
    }
    
    public int getNumero() {
        return numero;
    }
}
