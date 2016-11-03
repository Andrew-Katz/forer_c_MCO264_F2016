package Polynomials;

public class Polynomial extends MonomialLinkedList
{

    public boolean Reduce()
    {
        boolean blnRV = true;
        try
        {
            if (head != null)
            {
                MonomialNode currNode = head;
                MonomialNode prevNode = null;
                while (currNode != null)
                {
                    MonomialNode nextNode = currNode.getNext();
                    if (nextNode == null)
                    {
                        break; // while loop
                    }
                    Monomial currMono = currNode.getInfo();
                    Monomial nextMono = nextNode.getInfo();
                    if (currMono.getDegree() == nextMono.getDegree())
                    {
                        do
                        {
                            currMono.setCoeffi(currMono.getCoeffi() + nextMono.getCoeffi());
                            nextNode = nextNode.getNext();
                            if (nextNode != null)
                            {
                                nextMono = nextNode.getInfo();
                            } else
                            {
                                break; // do loop
                            }
                        } while (currMono.getDegree() == nextMono.getDegree());
                        currNode.setNext(nextNode);
                    }
                    if (currMono.getCoeffi() == 0.0) // then drop it (skip it)
                    {
                        if (prevNode == null) // we are dropping the head
                        {
                            head = currNode.getNext();
                        } else
                        {
                            prevNode.setNext(currNode.getNext());
                        }
                    } else
                    {
                        prevNode = currNode;
                    }
                    currNode = currNode.getNext();
                }
            }
        } catch (Exception ex)
        {
            blnRV = false;
        }
        return blnRV;
    }

    public boolean addTerm(Monomial mono)
    {
        boolean blnRV = false;
        if (insert(mono))
        {
            blnRV = Reduce();
        }

        return blnRV;
    }

    public boolean addPolynomial(Polynomial poly)
    {
        boolean blnRV = true;
        // to do : traverse poly adding one node at a time to this
        try
        {
            MonomialNode currNode = poly.head;
            while (currNode != null)
            {
                MonomialNode nextNode = currNode.getNext();
                this.addTerm(currNode.getInfo());
                currNode = nextNode;
            }
        } catch (Exception ex)
        {
            blnRV = false;
        }
        return blnRV;
    }
    public Polynomial multiplyPolynomial(Polynomial poly)
    {
        Polynomial product = new Polynomial();
        // TODO add all the monomial product terms to "product" polynomial
        return product;
    }
}
