public class Gara
{
    private Automobile[] automobili;
    public Gara(int nGiri, int nAutomobili)
    {
        Automobile.giriMax = nGiri;
        Automobile.tMin = 1.200;
        Automobile.tMax = 3.000;
        
        automobili = new Automobile[nAutomobili];
        
        for (int i = 0; i < nAutomobili; i++) {
            int n = (int)Math.round(Math.random()*100);
            automobili[i] = new Automobile(n);
            System.out.println("Numero auto " + i + ": " + n);
        }
    }
    
    public void iniziaGara() {
        for (int i = 0; i < automobili.length; i++) {
            automobili[i].start();
            System.out.println("Auto " + automobili[i].getNumero() + " è partita");
        }
    }
    
    public static void main(String[] args) {
        Gara gara1 = new Gara(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        gara1.iniziaGara();
    }
}
