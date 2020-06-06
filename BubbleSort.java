package com.company;

class BubbleSort
{
    void bubbleSort(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (a[j] > a[j+1])
                {
                    int flag = a[j];
                    a[j] = a[j+1];
                    a[j+1] = flag;
                }
    }
    void printArray(int x[])
    {
        int n = x.length;
        for (int i=0; i<n; ++i)
            System.out.print(x[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int array[] = {12,8,7,5,2};
        ob.bubbleSort(array);
        System.out.println("SORTED ARRAYS");
        ob.printArray(array);
    }
}
