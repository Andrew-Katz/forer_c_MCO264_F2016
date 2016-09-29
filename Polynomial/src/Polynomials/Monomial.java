/*
 *  A copyright might go here....
 */
package Polynomials;


/*-----------------------------------------
    used to represents objects
    of the type ax^n:
        degree = n (non-negative integer)
        coefficient = a (real number)
-------------------------------------------*/
public class Monomial
{
    // <editor-fold  desc="private members">
    private int     degree;
    private double  coeffi;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constructors">
    Monomial(int degr, double coef)
    {
        degree = degr;
        coeffi = coef;
    }
    Monomial()
    {
        degree = 0;
        coeffi = 0.0;
    }
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="getters/setters">
    public void setDegree(int degree)
    {
        this.degree = degree;
    }

    public void setCoeffi(double coeffi)
    {
        this.coeffi = coeffi;
    }

    public int getDegree()
    {
        return degree;
    }

    public double getCoeffi()
    {
        return coeffi;
    }
    //</editor-fold>
    
    public String Show()
    {
        String strRV = "";
        strRV = String.format("%.2fx^%d", coeffi, degree);
        return strRV;
    }
    
    public int CompareTo(Monomial other)
    // returns (this.degree - other.degree) / ABS(this.degree - other.degree)
    {
        int intRV = 0;
        if (this.degree > other.degree)
        {
            intRV = 1;
        }
        else if (this.degree < other.degree)
        {
            intRV = -1;
        }
        return intRV;
    }
}
