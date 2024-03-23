package leetcode;

// 1768. Merge Strings Alternately
// Easy
// Topics
// Companies
// Hint
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.

// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Example 2:

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b 
// word2:    p   q   r   s
// merged: a p b q   r   s
// Example 3:

// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1:  a   b   c   d
// word2:    p   q 
// merged: a p b q c   d

// Constraints:

// 1 <= word1.length, word2.length <= 100
// word1 and word2 consist of lowercase English letters.

Combine duas strings,adicionando letras em ordem alternada,começando pela primeira string(word1).Se uma das strings for mais longa do que a outra,você deve simplesmente anexar as letras restantes no final da string mesclada.

class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Inicializa um StringBuilder para armazenar a string mesclada
        StringBuilder mergedString = new StringBuilder(); // => E.D para concatenar strings

        // Inicializa os contadores para percorrer word1 e word2
        int i = 0, j = 0;

        // Loop enquanto ainda houver caracteres em ambas as palavras
        while (i < word1.length() && j < word2.length()) {
            // Adiciona o caractere atual de word1 à string mesclada e incrementa i
            mergedString.append(word1.charAt(i++));

            // Adiciona o caractere atual de word2 à string mesclada e incrementa j
            mergedString.append(word2.charAt(j++));
        }

        // Se ainda houver caracteres restantes em word1, adiciona-os à string mesclada
        while (i < word1.length()) {
            mergedString.append(word1.charAt(i++));
        }

        // Se ainda houver caracteres restantes em word2, adiciona-os à string mesclada
        while (j < word2.length()) {
            mergedString.append(word2.charAt(j++));
        }

        // Retorna a string mesclada
        return mergedString.toString();
    }
}
