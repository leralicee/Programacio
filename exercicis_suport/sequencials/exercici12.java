package exercicis_suport.sequencials;

public class exercici12 {
    public static void main(String[] args) {
        
        double notaExamen = 3.5;
        double pesExamen = 0.6;
        double pesExercicis = 0.4;
        double notaMinimaAprovar = 5.0;

        double notaExercicisNecesaaria = (notaMinimaAprovar - (notaExamen * pesExamen)) / pesExercicis;
        
        System.out.println("Nota necessària en exercicis: " + notaExercicisNecesaaria);
    }
}

//ACABAR