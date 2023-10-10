package br.com.asilva;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os nomes separados por vírgula: ");
        String input = scanner.nextLine();

        String[] nomes = input.split(",");

        List<String> listaNomes = new ArrayList<>(Arrays.asList(nomes));

        Collections.sort(listaNomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : listaNomes) {
            System.out.println(nome.trim());
        }
    }
}
