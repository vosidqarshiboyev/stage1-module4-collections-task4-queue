package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer>a=new ArrayList<>();
        for(int i=1;i<=numberOfDishes;i++){
            a.add(i);
        }
        List<Integer>result=new ArrayList<>();
       int i=0;
       while(!a.isEmpty()){
           int ever1=everyDishNumberToEat;
           while(ever1>=1){
               i++;
               ever1--;
           }
           if(i>=a.size()){
               i=Math.abs(a.size()-i);
           }
           result.add(a.get(i));
           a.remove(i);
           i--;
       }
       return result;
    }
}
