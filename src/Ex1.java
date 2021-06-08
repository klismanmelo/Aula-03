import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        String palavra = new String();
        char[] vogais = {'a','e', 'i', 'o', 'u'};
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        palavra = ler.nextLine();

        System.out.println(palavra.toUpperCase());

        System.out.println(palavra.compareTo(vogais));
    }
}
