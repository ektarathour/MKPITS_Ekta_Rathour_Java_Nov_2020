//A program of convert array element into list
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExOfConvertingArrayToList {
    public static void main(String[] args){
        //Creating array
        String[] array={"Java","Python","PHP","C++"};
        System.out.println("Printing Array:"+ Arrays.toString(array));
        //converting array to list
        List<String> list=new ArrayList<String>();
        for(String lang:array) {
            list.add(lang);
        }
        System.out.println("Printing list:"+list);
        }
    }
