package java_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayListDemo {
    public static void main(String[] args) {
       ArrayList<Integer>arr=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
       int opt;
       int size;
        do {
            System.out.println("1.INPUT");
            System.out.println("2.OUTPUT");
            System.out.println("3.SEARCH");
            System.out.println("4.DELETE");
            System.out.println("5.UPDATE");
            System.out.println("6.SORTED");
            System.out.println("8.EXIT");
            opt=scan.nextInt();
          switch (opt){
              case 1->{
                  System.out.println("_____INPUT_______");
                  System.out.println("How many element you to insert:");
                  size=scan.nextInt();
                  for (int i=0;i<size;i++){
                      System.out.println("Enter element here:");
                      int num=scan.nextInt();
                      arr.add(num);
                  }
              }
              case 2->{
                  System.out.println("_______OUTPUT_______");
                  for(int i:arr){
                      System.out.println(i);
                  }
              }
              case 3->{
                  System.out.println("______SEARCH______");
                  System.out.println("Enter element you want to search for");
                  int searchElement=scan.nextInt();
                  boolean status=false;
                  int i;
                  for( i=0;i<arr.size();i++){
                      if(arr.get(i).equals(searchElement)){
                          status=true;
                          break;
                      }
                  }
                  if(!status){
                      System.out.println("element not found in the list");
                  }else{
                      System.out.println(arr.get(i)+" present in the list");
                  }
              }
              case 4->{
                  System.out.println("Enter element you want to delete in the list");
                  int deleteElement=scan.nextInt();
                  if(arr.contains(deleteElement)){
                      arr.remove(arr.indexOf(deleteElement));
                      System.out.println("element already deleted in the list");
                  }else {
                      System.out.println("element not found in the list");
                  }
              }
              case 5->{
                  System.out.println("Enter element you want to update");
                  int updateelement=scan.nextInt();
                  if(arr.contains(updateelement)){
                      System.out.println("Enter the the updated element");
                      int replace=scan.nextInt();
                      arr.set(arr.indexOf(updateelement),replace);
                  }else{
                      System.out.println("Entered element in not found in the list");
                  }
              }
              case 6->{
                  System.out.println("----------------Sorted--------------");
                  Collections.sort(arr);
                  arr.forEach(System.out::println);
              }

          }

        }while (opt!=8);
    }
}
