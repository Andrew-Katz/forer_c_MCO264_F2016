/**
 *
 * @author vforer
 */
public class Monomial
{
    //<editor-fold desc="private members">
    private int     degree;
    private double  coeffi;
    //</editor-fold>

   //<editor-fold desc="Constructors">   
    
    public Monomial()
    {
        degree = 0;
        coeffi = 0;        
    }
    
    public Monomial(int dd, double cc)
    {
        degree = dd;
        coeffi = cc;
    }
    
    public Monomial(Monomial mm)
    {
        degree = mm.getDegree();
        coeffi = mm.getCoeffi();
    }
    
  //</editor-fold>

    
 //<editor-fold desc="Getters and Setters">   
    public int getDegree()
    {
        return degree;
    }

    public void setDegree(int degree)
    {
        this.degree = degree;
    }

    public double getCoeffi()
    {
        return coeffi;
    }

    public void setCoeffi(double coeffi)
    {
        this.coeffi = coeffi;
    }
    
  //</editor-fold>
    
    public String Show()
    {
        String strRV = String.format("%.2f x^ %d", coeffi,degree);
        return strRV;
    }
    
}
