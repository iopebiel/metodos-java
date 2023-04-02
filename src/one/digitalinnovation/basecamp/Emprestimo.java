package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public class Emprestimo {

    public static int getDuasParcelas(){

        return 2;
    }

    public static int getTresParcelas(){

        return 3;
    }

    public static double getTaxaDuasParcelas(){
        
        return 0.3;
    }

    public static double getTaxaTresParcelas(){

        return 0.45;
    }

    public static void calcular(double valor, int parcelas){
        double valorfinal;

        if (parcelas == 2){
            valorfinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("O valor final é de R$"+valorfinal);
            System.out.println("Cada parcela é de R$"+valorfinal/2);
        }

        else if (parcelas == 3)
        {
            valorfinal = valor + (valor * getTaxaTresParcelas());
            System.out.println("O valor final é de R$"+valorfinal);
            System.out.println("Cada parcela é de R$"+(valorfinal/3));
        }
        else 
            System.out.println("Valor de parcelas não autorizada.");
    }
}