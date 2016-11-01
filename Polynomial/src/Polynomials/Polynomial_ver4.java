
package Polynomials;

public class Polynomial_ver4
{

    public static void main(String[] args)
    {
          Polynomial polynomial = new Polynomial();
          String strPoly = polynomial.toString();
          System.out.println("New poly: |" + strPoly +"|");
          
          Monomial monomial_1 = new Monomial(1,1.1);
          polynomial.addTerm(monomial_1);
          strPoly = polynomial.toString();
          System.out.println("addTermed 1.1x: |" + strPoly +"|");
          
          Monomial monomial_5 = new Monomial (5, 5.5);
          polynomial.addTerm(monomial_5);
          strPoly = polynomial.toString();
          System.out.println("addTermed 5.5x^5: |" + strPoly +"|");
          
          Monomial monomial_3 = new Monomial(3,3.3);
          polynomial.addTerm(monomial_3);
          strPoly = polynomial.toString();
          System.out.println("addTermed 3.3x^3: |" + strPoly +"|");
          
          Monomial monomial_0 = new Monomial(0,0.5);
          polynomial.addTerm(monomial_0);
          strPoly = polynomial.toString();
          System.out.println("addTermed 0.5: |" + strPoly +"|");
          
          monomial_3.setCoeffi(3.2);
          polynomial.addTerm(monomial_3);
          strPoly = polynomial.toString();
          System.out.println("addTermed 3.2x^3: |" + strPoly +"|");

          monomial_5.setCoeffi(5.4);
          polynomial.addTerm(monomial_5);
          strPoly = polynomial.toString();
          System.out.println("addTermed 5.4x^5: |" + strPoly +"|");

          monomial_0.setCoeffi(0.4);
          polynomial.addTerm(monomial_0);
          strPoly = polynomial.toString();
          System.out.println("addTermed 0.4: |" + strPoly +"|");

          Monomial negMon = new Monomial(3,-6.5);
          polynomial.addTerm(negMon);
          strPoly = polynomial.toString();
          System.out.println("addTermed -6.5x^3: |" + strPoly +"|");
          
          negMon.setCoeffi(-10.9);
          negMon.setDegree(5);
          polynomial.addTerm(negMon);
          strPoly = polynomial.toString();
          System.out.println("addTermed -10.9x^5: |" + strPoly +"|");
          
          negMon.setCoeffi(-0.9);
          negMon.setDegree(0);
          polynomial.addTerm(negMon);
          strPoly = polynomial.toString();
          System.out.println("addTermed -0.9: |" + strPoly +"|");
    }
}
