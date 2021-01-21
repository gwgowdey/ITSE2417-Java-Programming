// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 14.

/*
Assignment:
Modify the selection sort algorithm to sort an array of 
integers in descending order.
*/

public class Lesson14
{
   private int[] a;

   /* Constructs a selection sorter.
      @param anArray the array to sort. */
   public SelectionSorter(int[] anArray)
   {
      a = anArray;
   }

   // Sorts the array managed by this selection sorter.
   public void sort()
   {  
      for (int i = 0; i < a.length - 1; i++)
      {  
         int maxPos = maximumPosition(i);
         if (maxPos != i)
            swap(maxPos, i);
      }
   } 

   /*
      Finds the largest element in a tail range of the array.
      @param from the first position in a to compare.
      @return the position of the largest element in the
      range a[from] . . . a[a.length - 1].
   */
   public int maximumPosition(int from)
   {  
      int maxPos = from;
      for (int i = from + 1; i < a.length; i++)
         if (a[i] > a[maxPos]) maxPos = i;
      return maxPos;
   }

   /*
      Swaps two entries of the array.
      @param i the first position to swap.
      @param j the second position to swap.
   */
   private void swap(int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}