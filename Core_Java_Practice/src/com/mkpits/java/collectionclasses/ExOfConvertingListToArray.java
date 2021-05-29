//A program of converting list to array
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExOfConvertingListToArray {
    public static void main(String[] args){
        List<String> nameList=new ArrayList<String>();
        nameList.add("Ruchi");
        nameList.add("Manu");
        nameList.add("Ekta");
        nameList.add("Diksha");
        //converting list to array
        String[] array=nameList.toArray(new String[nameList.size()]);
        System.out.println("Printing Array:"+ Arrays.toString(array));
        System.out.println("Printing list:"+nameList);
    }
}

    
