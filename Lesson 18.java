// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 18.

/*
Assignment:
Implement a generic version of the binary search algorithm.
*/

public class Lesson18
{
   public class BinarySearcher<T extends Comparable>
   {  
      private T[] a;

      /* Constructs a BinarySearcher.
         @param anArray a sorted array. */
      public BinarySearcher(T[] anArray)
      {
         a = anArray;
      }
      
      /*
         Finds a value in a sorted array, using the binary search algorithm.
         @param v the value to search.
         @return the index at which the value occurs, or 1 if it does not 
         occur in the array.
      */
      public int search(T v)
      {  
         int low = 0;
         int high = a.length - 1;
         while (low <= high)
         {
            int mid = (low + high) / 2;
            int diff = a[mid].compareTo(v);
         
            if (diff == 0)
               return mid;
            else if (diff < 0) 
               low = mid + 1;
            else
               high = mid - 1;         
         }
         return -1;
      }
   }
}