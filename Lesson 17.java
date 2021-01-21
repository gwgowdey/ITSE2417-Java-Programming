// Student: Griffin Gowdey.
// Instructor: Daniel Goodman.
// Class Number: ITSE1479-86039.
// Class Name: Java Programming.
// Semester: Fall 2020.
// Lesson 17.

/*
Assignment:
Write a method that counts the number of all leaves in a tree.
*/

import java.util.List;
import java.util.ArrayList;

public class Lesson17
{
    
   // A tree in which each node has an arbitrary number of children.
   public class Tree
   {
      private Node root;

      class Node
      {
         public Object data;
         public List<Node> children;

         /* Computes the size of the subtree whose root is this node.
            @return the number of nodes in the subtree. */
         public int size()
         {
            int sum = 0;
            for (Node child : children) { sum = sum + child.size(); }
            return 1 + sum;
         }
         
         public int leafCount()
         {
            int sum = 0;
            if (children.size() == 0) 
            {
               sum = 1;
            }
            else
            {
               for (Node child : children) 
               { 
                  sum = sum + child.leafCount(); 
               }
            }
            return sum;
         }
      }

      // Constructs an empty tree.
      public Tree()
      {
         root = null;
      }

      /* Constructs a tree with one node and no children.
         @param rootData the data for the root. */
      public Tree(Object rootData)
      {
         root = new Node();
         root.data = rootData;
         root.children = new ArrayList<>();
      }

      // Adds a subtree as the last child of the root.
      public void addSubtree(Tree subtree)
      {
         root.children.add(subtree.root);
      }

      /* Computes the size of this tree.
         @return the number of nodes in the tree. */
      public int size() 
      {
         if (root == null) { return 0; }
         else { return root.size(); }
      }
      
      /* Computes the number of leaves in the tree.
         @return the number of leaves in the tree. */
      public int leafCount()
      {
         if (root == null) { return 0; }
         else { return root.leafCount(); }
      }
   }
}