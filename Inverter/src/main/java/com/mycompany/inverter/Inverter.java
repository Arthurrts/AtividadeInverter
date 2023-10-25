/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inverter;
import java.util.Stack;

/**
 *
 * @author thuts
 */
public class Inverter {
    public static String InverterP(String input) {
        String[] words = input.split(" "); // Dividir a string em palavras
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String InverterWord = InverterW(word); // Inverter a palavra
            result.append(InverterWord).append(" ");
        }

        // Remover o espaço extra no final
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }

    private static String InverterW(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        StringBuilder InverterPalavras = new StringBuilder();
        while (!stack.isEmpty()) {
            InverterPalavras.append(stack.pop());
        }

        return InverterPalavras.toString();
    }

    public static void main(String[] args) {
        String input1 = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String input2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";

        String output1 = InverterP(input1);
        String output2 = InverterP(input2);

        System.out.println(output1);
        System.out.println(output2);
    }
}