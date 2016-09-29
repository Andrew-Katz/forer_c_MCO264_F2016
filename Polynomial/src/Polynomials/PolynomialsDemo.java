/*
 *  A copyright might go here....
 */
package Polynomials;


public class PolynomialsDemo
{
    public static void main(String[] args)
    {
          Polynomial polynomial = new Polynomial(5);
          String strPoly = polynomial.Show();
          System.out.println("New poly: |" + strPoly +"|");
          
          Monomial monomial_1 = new Monomial(1,1.1);
          polynomial.Insert(monomial_1);
          strPoly = polynomial.Show();
          System.out.println("inserted 1.1x: |" + strPoly +"|");
          
          Monomial monomial_5 = new Monomial (5, 5.5);
          polynomial.Insert(monomial_5);
          strPoly = polynomial.Show();
          System.out.println("inserted 5.5x^5: |" + strPoly +"|");
          
          Monomial monomial_3 = new Monomial(3,3.3);
          polynomial.Insert(monomial_3);
          strPoly = polynomial.Show();
          System.out.println("inserted 3.3x^3: |" + strPoly +"|");
          
          Monomial monomial_0 = new Monomial(0,0.5);
          polynomial.Insert(monomial_0);
          strPoly = polynomial.Show();
          System.out.println("inserted 0.5: |" + strPoly +"|");
          
          polynomial.Insert(monomial_3);
          strPoly = polynomial.Show();
          System.out.println("inserted 3.3x^3: |" + strPoly +"|");

          polynomial.Insert(monomial_5);
          strPoly = polynomial.Show();
          System.out.println("inserted 5.5x^5: |" + strPoly +"|");

          polynomial.Insert(monomial_0);
          strPoly = polynomial.Show();
          System.out.println("inserted 0.5: |" + strPoly +"|");

          polynomial.Drop(monomial_3);
          strPoly = polynomial.Show();
          System.out.println("dropped degree 3: |" + strPoly +"|");

          polynomial.Drop(monomial_5);
          strPoly = polynomial.Show();
          System.out.println("dropped degree 5: |" + strPoly +"|");

          polynomial.Drop(monomial_0);
          strPoly = polynomial.Show();
          System.out.println("dropped degree 0: |" + strPoly +"|");
   }
}
