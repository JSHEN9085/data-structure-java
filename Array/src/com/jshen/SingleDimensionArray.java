package com.jshen;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void TraverseArray() {
        try {
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        } catch(Exception e){
            System.out.println("Array no longer exists !");
        }
    }

    public void insert(int location, int value){
        try{
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = value;
                System.out.println("Successfully inserted " + value + " at location " + location);
            } else {
                System.out.println("This cell is already occupied by another value.");
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void accessingCell(int index){
        try{
            System.out.println(arr[index]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array!");
        }
    }

    public void search(int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                System.out.println(value + " is found");
                System.out.println("index of " + value + " is " + i);
                return;
            }
        }
        System.out.println(value + " is not found");
    }


}
