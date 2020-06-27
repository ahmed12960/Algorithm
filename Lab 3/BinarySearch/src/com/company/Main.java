package com.company;

class BinarySearchExample{
    public static void binarySearch (int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if (arr[mid] < key) {
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Search Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Search Element is not found!");
        }
    }
    public static void main(String args[]){
        int arr[] = {30,90,2,65,22,5};
        int key = 9;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
    }
}
//Binary search Algorithm:
//Worst case performance  ‎O(log n)
//Best case performance О(1)
//Average case performance  ‎O(log n)
