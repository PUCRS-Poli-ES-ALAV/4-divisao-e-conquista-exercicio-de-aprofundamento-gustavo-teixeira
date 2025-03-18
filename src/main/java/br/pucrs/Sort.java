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

        
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        int mid = array.size()/2;

        // divide a lista ao meio
        for(int i =0; i < mid; i++){
            left.add(array.get(i));
        }
        for (int j = mid ; j < array.size(); j++){
            right.add(array.get(j));
        }


        left = mergeSort(left);
        right = mergeSort(right);
        //volta da recursao
        List<Integer> list = merge(left,right);

        return list;
   }
    

   private List<Integer> merge(List<Integer> left, List<Integer> right){
        List<Integer> list = new ArrayList<>();


        int j = 0;
        int k = 0;


        //ordena  
        while(j < left.size() && k < right.size()){
            if(left.get(j) > right.get(k)){
                list.add(right.get(k));
                k++;
            }else if(left.get(j) <= right.get(k)){
                list.add(left.get(j));
                j++;
            }
        }

        //checa se algum elemento da lista da esquerda nao foi pra lista principal
        while(j < left.size()){
            list.add(left.get(j));
            j++;      
        }
        //checa se algum elemento da lista da direita nao foi pra lista principal

        while(k < right.size()){
            list.add(right.get(k));
            k++;
        }        
        return list;

   }
}
