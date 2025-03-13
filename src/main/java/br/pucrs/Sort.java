package br.pucrs;

import java.util.ArrayList;
import java.util.List;

public class Sort {
   public Sort(){
   } 

   public List<Integer> mergeSort(List<Integer> array){
        if(array.size() == 1){
            return array;   
        }

        List<Integer> left = mergeSort(array.subList(0, (array.size()/2)));
        List<Integer> right = mergeSort(array.subList(array.size()/2 + 1, array.size()-1));

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
