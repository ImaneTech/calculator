package com.imane.calculator;
import java.util.HashSet;
import java.util.Set;

public class Calculator {
        public static int add(int a, int b) {
            long result = (long) a+ (long) b;
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                throw new ArithmeticException("Résultat de l'addition hors des limites");
            return (int)result;
        }
        public static int divide(int a, int b) {
            if (b == 0)
                throw new ArithmeticException("Division sur zero est Impossible");
            return a / b;
        }
    public static Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> chiffres = new HashSet<>();
        String nombreStr = Integer.toString(Math.abs(pNombre)); // Convertir en positif pour gérer les négatifs

        for (char ch : nombreStr.toCharArray()) {
            chiffres.add(Character.getNumericValue(ch)); // Ajouter chaque chiffre au Set
        }
        return chiffres;
    }
}


