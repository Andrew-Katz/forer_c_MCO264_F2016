
package Polynomials;

public interface LinkedListInterface
{
//----------------------------------------------------------------------
// LinkedListInterface.java      
//
// Interface for a class that implements a polynomial 
// as an ADT  linked list of Monomials  
// 
// required methods are:
//      insert      -   insert a new node
//      delete      -   delete a node with a given information
//----------------------------------------------------------------------

    
  boolean insert(Monomial mono);
  // inserts element into this Linked List.

  boolean delete(MonomialNode node);
  // removes element from this Linked List.
 
}
