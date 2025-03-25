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
        int size = 32;
        
        for(int i = 0; i < size; i++){
            arr.add(r.nextInt(size));
        }

        System.out.print("                                | Tempo (S)      | Iterações\n");
        long start = System.nanoTime();
        arr = s.mergeSort(arr);
        long end = (System.nanoTime() - start);
        System.out.printf("Merge Sort x %d                 | %.12f | %d\n", size,end*1e-9, s.iterations);



        arr = new ArrayList<>();
        s = new Sort();
        size = 2048;        

        for(int i = 0; i < size; i++){
            arr.add(r.nextInt(size));
        }

      

        start = System.nanoTime();
        arr = s.mergeSort(arr);
        end = (System.nanoTime() - start);
        System.out.printf("Merge Sort x %d               | %.12f | %d\n", size,end*1e-9, s.iterations);
        

        arr = new ArrayList<>();
        s = new Sort();
        size = 1048576;        

        for(int i = 0; i < size; i++){
            arr.add(r.nextInt(size));
        }

        start = System.nanoTime();
        arr = s.mergeSort(arr);
        end = (System.nanoTime() - start);
        System.out.printf("Merge Sort x %d            | %.12f | %d\n", size,end*1e-9, s.iterations);
        

        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------

        size = 32;

        long A [] = new long[size];
        var findmax = new FindMax();

        
        for(int i = 0; i < size; i++){
            A[i] = r.nextInt(size);        
        }

        start = System.nanoTime();
        long max = findmax.maxVal(A, A.length);
        end = System.nanoTime() - start;

        System.out.printf("Max(Nao recursivo) x %d         | %.12f | %d\n", size,end*1e-9, findmax.iterations);

        size = 2048;
        A = new long[size]; 

        for(int i = 0; i <size; i++){
            A[i] = r.nextInt(size);        
        }

        start = System.nanoTime();
        max = findmax.maxVal(A, A.length);
        end = System.nanoTime() - start;

        System.out.printf("Max(Nao recursivo) x %d       | %.12f | %d\n", size,end*1e-9, findmax.iterations);



        size = 1048576;
        A = new long[size]; 

        for(int i = 0; i <size; i++){
            A[i] = r.nextInt(size);        
        }

        start = System.nanoTime();
        max = findmax.maxVal(A, A.length);
        end = System.nanoTime() - start;

        System.out.printf("Max(Nao recursivo) x %d    | %.12f | %d\n", size,end*1e-9, findmax.iterations);


        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------

        size = 32;
        A = new long[size];
        for(int i = 0; i <size; i++){
            A[i] = r.nextInt(size);        
        }

        var f = new FindMax();
        start = System.nanoTime();
        f.maxVal2(A,0, A.length-1);
        end = System.nanoTime() - start;



        System.out.printf("Max(Recursivo) x %d             | %.12f | %d\n", size,end*1e-9, f.iterations);

        size = 2048;
        A = new long[size]; 

        for(int i = 0; i <size; i++){
            A[i] = r.nextInt(size);        
        }
        findmax = new FindMax();
        start = System.nanoTime();
        findmax.maxVal2(A,0, A.length-1);
        end = System.nanoTime() - start;

        System.out.printf("Max(Recursivo) x %d           | %.12f | %d\n", size,end*1e-9, findmax.iterations);


        
        size = 1048576;
        A = new long[size]; 

        for(int i = 0; i <size; i++){
            A[i] = r.nextInt(size);        
        }
        findmax = new FindMax();
        start = System.nanoTime();
        findmax.maxVal2(A,0, A.length-1);
        end = System.nanoTime() - start;

        System.out.printf("Max(Recursivo) x %d        | %.12f | %d\n", size,end*1e-9, findmax.iterations);



        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        // ----------------------------------------------------------------------------------------------------
        

        Multiply mul = new Multiply();
        int bits = 4;

        start = System.nanoTime();
        mul.multiply(3, 4, bits);
        end = System.nanoTime() - start;
        System.out.printf("Multiplicacao(Inteiros) %d bits  | %.12f | %d\n", bits,end*1e-9,mul.it);


        mul = new Multiply();

        bits = 16;
        start = System.nanoTime();
        mul.multiply(3, 4, bits);
        end = System.nanoTime() - start;
        System.out.printf("Multiplicacao(Inteiros) %d bits | %.12f | %d\n", bits,end*1e-9, mul.it);
        
       
        mul = new Multiply();

        bits = 64;
        start = System.nanoTime();
        mul.multiply(2, 120312090, bits);
        end = System.nanoTime() - start;        
        System.out.printf("Multiplicacao(Inteiros) %d bits | %.12f | %d\n", bits,end*1e-9, mul.it);


         //--------------------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------------------


        String x = "0100";
        String y = "0100";

        mul = new Multiply();
        bits = 4;
        start = System.nanoTime();
        mul.multiply(x, y, bits);
        end = System.nanoTime() - start;
        System.out.printf("Multiplicacao(Binarios) %d bits  | %.12f | %d\n", bits,end*1e-9,mul.it);



        x = "0100010001000100";
        y = "0100010001000100";

        mul = new Multiply();

        bits = 16;
        start = System.nanoTime();
        mul.multiply(x,y, bits);
        end = System.nanoTime() - start;
        System.out.printf("Multiplicacao(Binarios) %d bits | %.12f | %d\n", bits,end*1e-9, mul.it);
        

        mul = new Multiply();

        x = "0100010001000100010001000100010001000100010001000100010001000100";
        y = "0100010001000100010001000100010001000100010001000100010001000100";

        bits = 64;
        start = System.nanoTime();
        mul.multiply(x,y, bits);
        end = System.nanoTime() - start;        
        System.out.printf("Multiplicacao(Binarios) %d bits | %.12f | %d\n", bits,end*1e-9, mul.it);



    }
}
