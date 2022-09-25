/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jktvmassiv;

import java.util.Random;

/**
 *
 * @author kostj
 */
public class JKTVMassiv {

    public static void main(String[] args) {
        int n = 20;
        Random random = new Random();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length;i++){
            arr[i] = random.nextInt(n);
        }
        int sum = 0;
        int min = 0;
        int max = 0;
        System.out.print("[");
        for(int i = 0; i<arr.length;i++){
        System.out.printf("%2d,",arr[i]);
            sum += arr[i];
            if(min > arr[i]) min = arr[i];
            if(max < arr[i]) max = arr[i];
            
        }
        int summ=((sum-min-max)/18);
        System.out.print("]");
        System.out.println();
        System. out. println("Minimum = " + min);
        System. out. println("Maximum = " + max);
        System. out. println("Сумма без учёта максимума и минимума = " + sum);
        System. out. println("Средняя арифметическая = " + summ);
        }
    }

