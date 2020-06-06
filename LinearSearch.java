package com.company;

class LinearSearch
{
    public static int search(int a[], int x)
    {
        int n = a.length;
        for(int i = 0; i < n; i++)
        {
            if(a[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String args[])
    {
        int x[] = { 5,25,90,24 };
        int v = 90;

        int result = search(x, v);
        if(result == -1)
            System.out.print("Element is not available in array");
        else
            System.out.print("Element found at index " + result);
    }
}
