 
package Polynomials;



public class MonomialLinkedList implements LinkedListInterface
{
    
  protected MonomialNode head; // reference to first node in  
                               // Linked List forming this polynomial
  
  public MonomialLinkedList()
  // Instantiates and returns a reference to an empty polynomial
  {
    this.head = null;
    
  }

  public boolean insert(Monomial mono)
  // Places mono into this polynomial.
  {      
    boolean blnRV = true;
    try
    {
        MonomialNode newNode = new MonomialNode(mono);
        if (this.head == null)   // Linked List is empty
        {   
            head = newNode;
        }
        else    // Linked List contains nodes
        {
            MonomialNode predNode = LocatePredecessor(mono);
            if (predNode == null)   // mono to become the first node
            {
                newNode.setNext(head);
                head = newNode;  
            }            
            else  // inserting new term beyond the head
            {
                newNode.setNext(predNode.getNext());
                predNode.setNext(newNode);
                
            } // inserting the node beyond the head            
        } // have a non-empty linked list
    } // try
    catch(Exception ex)
    {
        blnRV = false;
    }
    return blnRV;
  }

 public boolean delete(MonomialNode node)
 {
     boolean blnRV = true;
     try
     {
        if (node == head)
        {
            head = node.getNext();
           
        }
        else
        {
            MonomialNode predNode = head;
            while (predNode.getNext() != null &&  predNode.getNext() != node )
            {
                predNode = predNode.getNext();
            }
            if (predNode.getNext() == node)
            {
                predNode.setNext(node.getNext());
            }
        }
     }
     catch(Exception ex)
     {
         blnRV = false;
     }
     return blnRV;
 }
 
 
  public String toString()
  // Returns a nicely formatted string representing this linked list.
  {
    String strRV = "";
    MonomialNode currNode = head;
    while (currNode != null)
    {
        strRV += currNode.getInfo().toString();
        MonomialNode nextNode = currNode.getNext();
        if (nextNode != null)  
        {
            strRV += " + ";
        }
        currNode = nextNode;        
    }
    return strRV;
  }
  
  private  MonomialNode LocatePredecessor(Monomial mono)
  {
      MonomialNode currNode = head;
      MonomialNode prevNode = null;
      int monoDegree = mono.getDegree();
      while (currNode != null)
      {
          if (currNode.getInfo().getDegree() <= monoDegree)
          {
              break;
          }
          else
          {
              prevNode = currNode;
              currNode = currNode.getNext();
          }
      }
      return prevNode;
  }
}