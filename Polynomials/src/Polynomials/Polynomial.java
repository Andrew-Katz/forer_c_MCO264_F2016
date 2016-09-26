package Polynomials;

public class Polynomial
{

    //<editor-fold desc="Private Members">
    private Monomial polynomial[];
    private int length;
    private int inUse;
    //</editor-fold>

    //<editor-fold desc="Constructors">
    public Polynomial(int len)
    {
        polynomial = new Monomial[len];
        length = len <= 0 ? 1 : len;
        inUse = 0;
    }

    public Polynomial(Polynomial poly)
    {
        polynomial = new Monomial[poly.length];
        System.arraycopy(poly.polynomial, 0, polynomial, 0, poly.inUse);
        inUse = poly.inUse;
    }
    //</editor-fold>

    //<editor-fold desc="Getters and Setters">
    public Monomial[] getPolynomial()
    {
        return polynomial;
    }

    public void setPolynomial(Monomial[] poly)
    {
        this.polynomial = poly;
        for (int ii = 0; ii < this.length; ii++)
        {
            if (this.polynomial[ii].getCoeffi() != 0)
            {
                inUse++;
            }
        }
    }

    public int getInUse()
    {
        return inUse;
    }

    //</editor-fold>
    public boolean Insert(Monomial mono)
    {
        boolean success = false;
        int initInUse = inUse;
        if (inUse == 0)
        {
            polynomial[0] = new Monomial(mono);
            ++inUse;
            success = true;
        } else if (inUse == this.length)
        {
            int len = length * 2;
            Monomial poly[] = new Monomial[len];
            System.arraycopy(polynomial, 0, poly, 0, inUse);
            polynomial = poly;
            length = length * 2;
        }

        for (int ii = 0; ii < initInUse; ii++)
        {

            switch (polynomial[ii].Compare(mono))
            {

                case 0:
                    polynomial[ii].setCoeffi(polynomial[ii].getCoeffi() + mono.getCoeffi());
                    success = true;
                    break;
                case -1:
                    int index = 0;
                    Monomial pol2[] = new Monomial[(initInUse) - ii];
                    for (int jj = ii; jj < initInUse; jj++)
                    {
                        pol2[index] = polynomial[jj];
                        index++;
                    }
                    polynomial[ii] = mono;
                    index = 0;
                    for (int kk = (ii+1);kk <= initInUse;kk++)
                    {
                        polynomial[kk] = pol2[index];
                        index++;
                    }
                    if (inUse == initInUse)
                    {
                        inUse++;
                    }
                    success = true;
                    break;
                case -99:
                    break;
            }
        }
        return success;
    }

    public String Show(int ii)
    {
        return (polynomial[ii].Show());
    }

}
