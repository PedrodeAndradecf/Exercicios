import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer entrada = sc.nextInt();

        ArrayList resultado = reverse(entrada);

        sc.close();

        for(int i = 0; i < resultado.size(); i++){
            System.out.print(resultado.get(i));
            System.out.print(" ");
        }
    }




    public static ArrayList<Integer> reverse(Integer valor){

        ArrayList<Integer> lista = new ArrayList<>();


        for(int i = 0; i <= valor; i++){
            lista.add(valor - i);

        }

        return lista;
    }
}
