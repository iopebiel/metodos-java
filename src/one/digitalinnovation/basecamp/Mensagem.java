package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public class Mensagem {
    public static void obterMensagem(int hora)
    {
        switch (hora)
        {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            {
                //mensagemBomDia(horas); //e comenta o de baixo
                System.out.println("São "+hora+" horas.Bom dia!");
                break;
            }

            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            {
                //mensagemBoaTarde(horas); //e comenta o de baixo
                System.out.println("São "+hora+" horas. Boa tarde!");
                break;
            }

            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            {
                //mensagemBoaNoite(horas); //e comenta o de baixo
                if (hora == 0 || hora == 1)
                    System.out.println("São "+hora+" hora. Boa noite!");
                else
                    System.out.println("São "+hora+" horas. Boa noite!");
                break;
            }
        }
    }
    public static void mensagemBomDia(int hora){
        System.out.println("São "+hora+" horas. Bom dia!");
    }

    public static void mensagemBoaTarde(int hora){
        System.out.println("São "+hora+" horas. Boa tarde!");
    }

    public static void mensagemBoaNoite(int hora){
        System.out.println("São "+hora+" horas. Boa noite!");
    }
}