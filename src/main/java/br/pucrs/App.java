package br.pucrs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */

 public class App 
{
    public static void main( String[] args )
    {
        List<Integer> arr = new ArrayList<>();
        Sort s = new Sort();
        Random r = new Random();

        for(int i = 0; i < 1048576; i++){
            arr.add(r.nextInt(1048576));
        }

        System.out.println("ORDENANDO");

        long start = System.nanoTime();
        arr = s.mergeSort(arr);
        long end = (System.nanoTime() - start);
        System.out.printf("%.12f s\n", end*1e-9);

        long A [] = new long[1048576];
        
        for(int i = 0; i < 1048576; i++){
            A[i] = r.nextInt(1048576);        
        }

        start = System.nanoTime();
        long max = FindMax.maxVal(A, A.length);
        end = System.nanoTime() - start;

        System.out.printf("find max 1 : %d, tempo: %.12f s\n", max, end*1e-9);

        for(int i = 0; i <1048576; i++){
            A[i] = r.nextInt(1048576);        
        }
        FindMax m = new FindMax();

        start = System.nanoTime();

        m.maxVal2(A,0, A.length-1);

        end = System.nanoTime() - start;

        System.out.printf("find max val 2 : %d, tempo: %.12f s\n", max, end*1e-9);
        
        Multiply mul = new Multiply();

        start = System.nanoTime();
        mul.multiply(3, 4, 44);
        end = System.nanoTime() - start;
        System.out.printf("tempo levado para 4 bits %.12f s \n", end*1e-9);

        start = System.nanoTime();
        mul.multiply(3, 4, 16);
        end = System.nanoTime() - start;
        System.out.printf("tempo levado para 16 bits %.12f s \n", end*1e-9);

        start = System.nanoTime();
        mul.multiply(2, 120312090, 64);
        end = System.nanoTime() - start;
        System.out.printf("tempo levado para 64 bits %.12f s \n", end*1e-9);
        
        String x = "0100";
        String y = "0100";

        System.out.println(mul.multiply(x, y, x.length()));



    }
}
