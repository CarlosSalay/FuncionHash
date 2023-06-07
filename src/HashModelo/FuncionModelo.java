/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashModelo;

/**
 *
 * @author Carlos Salay
 */
public class FuncionModelo {
    private static final double A = (Math.sqrt(5) - 1) / 2; 

    public static int multiplyHash(String key, int tableSize) {
        double hashValue = 0;
        for (int i = 0; i < key.length(); i++) {
            hashValue += key.charAt(i) * Math.pow(A, i);
        }
        int hash = (int) (hashValue * tableSize);
        hash %= tableSize;
        if (hash < 0) {
            hash += tableSize;
        }
        return hash;
    }
}

