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
        ArrayList<Integer> arr = new ArrayList<>();
        Sort s = new Sort();
        Random r = new Random();
        for(int i = 0; i < 1000; i++){
            arr.add(r.nextInt(1000));
        }

        System.out.println(arr);
        System.out.println("ORDENANDO");
        s.mergeSort(arr);
        System.out.println(arr);

    }
}



class Sort{
    public Sort(){
    } 
 
    public List<Integer> mergeSort(List<Integer> array){
         if(array.size() == 1){
             return array;   
         }
         
         List<Integer> left = mergeSort(array.subList(0, (array.size()/2)-1));
         List<Integer> right = mergeSort(array.subList(array.size()/2, array.size()-1));
 
         List<Integer> list = merge(left,right);
 
         return list;
    }
     
 
    private List<Integer> merge(List<Integer> left, List<Integer> right){
         List<Integer> list = new ArrayList<>();
 
         int j = 0;
         int k = 0;
 
 
         while(j < left.size() && k < right.size()){
             if(left.get(j) > right.get(k)){
                 list.add(right.get(k));
                 k++;
             }else if(left.get(j) <= right.get(k)){
                 list.add(left.get(j));
                 j++;
             }
         }
 
         if(j == left.size()){
             list.addAll(left);
         }
         if(k == right.size()){
             list.addAll(right);
         }
 
 
         return list;
 
    }
}
