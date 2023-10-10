package br.com.asilva;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os nomes e gêneros separados por vírgula: ");
        String input = scanner.nextLine();

        String[] pessoas = input.split(",");

        Map<String, StringBuilder> gruposGenero = new HashMap<>();

        for (String pessoa : pessoas) {
            String[] dados = pessoa.split("-");
            String nome = dados[0].trim();
            String genero = dados[1].trim();

            if (!gruposGenero.containsKey(genero)) {
                gruposGenero.put(genero, new StringBuilder());
            }

            gruposGenero.get(genero).append(nome).append(", ");
        }

        System.out.println("Grupos de gêneros:");
        for (Map.Entry<String, StringBuilder> entry : gruposGenero.entrySet()) {
            String genero = entry.getKey();
            String nomes = entry.getValue().toString().trim();
            System.out.println("Gênero: " + genero + ", Pessoas: " + nomes);
        }
    }
}


