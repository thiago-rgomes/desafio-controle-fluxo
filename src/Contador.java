import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parOne = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parTwo = terminal.nextInt();

        try {
            count(parOne, parTwo);
            System.out.println("Contagem bem-sucedida.");
        } catch (InvalidParametersException exception) {
            System.out.println(exception.getMessage());
        }

    }

    static void count(int parOne, int parTwo) throws InvalidParametersException {
        if (parTwo <= parOne) {
            throw new IllegalArgumentException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int counting = parTwo - parOne;
        int i = 1;
        while (i <= counting){
            System.out.println(i);
            i++;
        }

    }

}


