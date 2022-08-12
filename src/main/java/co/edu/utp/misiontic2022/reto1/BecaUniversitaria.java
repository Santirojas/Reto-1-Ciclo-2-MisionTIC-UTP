package co.edu.utp.misiontic2022.reto1;

public class BecaUniversitaria {
    //Atributos
    private double pMonto;
    private int pTiempo;
    private double pInteres;

    //Constructores
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        this.pMonto=pMonto;
        this.pInteres=pInteres;
        this.pTiempo=pTiempo;
    }

    public BecaUniversitaria() {
        pMonto=0;
        pTiempo=0;
        pInteres=0;
    }

    public double calcularInteresSimple(){
       double interesi=Math.round((pMonto*pInteres/100)*pTiempo);
        return interesi;
    }

    public double calcularInteresCompuesto(){
        double interesc=Math.round(pMonto*(Math.pow((1+pInteres/100),pTiempo)-1));
        return interesc;
        
    }

    public String compararInversion (int pTiempo, double pMonto, double pInteres){
        this.pMonto=pMonto;
        this.pInteres=pInteres;
        this.pTiempo=pTiempo;
        double diferencia=(calcularInteresCompuesto()-calcularInteresSimple());
        
        if(diferencia!=0){
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        }else{
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        
        
    }
    public String compararInversion ( ){
        
        double diferencia=(calcularInteresCompuesto()-calcularInteresSimple());
        
        if(diferencia!=0){
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        }else{
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        
    }

    public static void main( String[] args )
    {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria(48,10000,2);
System.out.println(becaUniversitaria.calcularInteresSimple());
System.out.println(becaUniversitaria.calcularInteresCompuesto());
System.out.println(becaUniversitaria.compararInversion());
    }
}
