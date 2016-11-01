
package Polynomials;

public class MonomialNode
{
  private Monomial info;
  private MonomialNode next;
  
  public MonomialNode(Monomial mono)
  {
    this.info = new Monomial(mono);
    this.next = null;
  }
 
  public void setInfo(Monomial info)
  // Sets info string of this LLStringNode.
  {
    this.info = info;
  }

  public Monomial getInfo()
  // Returns info string of this LLStringNode.
  {
    return info;
  }
 
  public void setNext(MonomialNode link)
  // Sets next of this MonomialNode to passed link.
  {
    this.next = link;
  }

  public MonomialNode getNext()
  // Returns next of this MonomialNode.
  {
    return next;
  }
}
 
 