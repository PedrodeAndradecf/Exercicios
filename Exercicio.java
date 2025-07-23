import java.util.HashMap;
import java.util.Map;
import java.util.*;



public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o texto");
        String entrada = sc.nextLine();


        //Letras letras = new Letras();

        Character resultado = firstUniqueC(entrada);

        System.out.println(resultado);



        sc.close();

    }
    public static Character firstUniqueC(String txt) {
        if (txt.isEmpty() || txt.length() == 0){
            return null;
        }
        Map<Character, Integer> CharCount = new HashMap<>();


        for (int i = 0; i < txt.length(); i++) {
            char character = txt.charAt(i);
            Integer currentCount = CharCount.getOrDefault(character, 0);
            CharCount.put(character, currentCount + 1);
        }


        for (int i = 0; i < txt.length(); i++){
            char character = txt.charAt(i);
            if (CharCount.get(character) == 1){
                return character;
            }
        }

        return null;
    }
}
