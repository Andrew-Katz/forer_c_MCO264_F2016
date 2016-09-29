package Polynomials;

public class Polynomial
{
    private Monomial[] poly;
    private int        length;
    private int        inUse;
    
    Polynomial(int len)
    {
        if (len < 1) len = 1;
        poly = new Monomial[len];
        length = len;
        inUse = 0;
    }
    
    Polynomial( Polynomial pp)
    {
        length = pp.length;
        poly = new Monomial[length];
        inUse = pp.inUse;
        CopyMonomialsArray(poly, 0, pp.poly, 0, inUse);
    }
    
    public int Locate(Monomial mon, boolean next)
    // locate the index of mon in poly
    // return -1 if not found
    // if next is true, then return 
    //     the index of the last term of degree 
    //     higher than that of mono
    {
        int intRV = -1; // not located
        if (inUse > 0)
        {
            int ix = 0;
            while ((ix < inUse) && poly[ix].CompareTo(mon) > 0)
            {
                ++ix;
            }
            if (poly[ix].CompareTo(mon) == 0)
            { 
                intRV = ix;
            }
            else if (next)
            {
                intRV = ix;
            }
        }
        return intRV;
    }
    
    public boolean Drop(Monomial mon)
    // delete the term of mon.degree
    // from poly        
    {
        boolean blnRV = false;
        int loc = Locate(mon,false);
        if (loc >= 0)
        {
            blnRV = CopyMonomialsArray(poly, loc, poly, loc+1, inUse - loc );
            if (blnRV)
            {
                --inUse;
            }
        }
        return blnRV;
    }
    
    public boolean Insert(Monomial mon)
    {
        boolean blnRV = true;
        int loc = Locate(mon, false);
        if (loc >= 0) // found a monomial of this degree in poly
        {
            poly[loc].setCoeffi(poly[loc].getCoeffi()+mon.getCoeffi());
        }
        else // degree of mon not present in poly
        {
            if (inUse == poly.length)
            {
                Polynomial pp = new Polynomial(poly.length * 2);
                if (CopyMonomialsArray(pp.poly,0,poly,0,inUse))
                {
                    poly = pp.poly;
                }
                else
                {
                    blnRV = false;
                }
            }
            if (blnRV)   
            {
                int place = Locate(mon,true);
                if(place == -1)
                {
                    poly[0].setDegree(mon.getDegree());
                    poly[0].setCoeffi(mon.getCoeffi());
                    ++inUse;
                }
                else if (CopyMonomialsArray(poly,place+1, poly, place, inUse-place))
                {
                    poly[place] = mon;
                    ++inUse;
                }
                else
                {
                    blnRV = false;
                }
            }
        }
        return blnRV;
    }
  
    
    public String Show()
    {
        String strRV = "";
        if (inUse > 0)
        {
            strRV = poly[0].Show();
            for (int ii = 1; ii < inUse; ++ii)
            {
                strRV += " + ";
                strRV += poly[ii].Show();
            }
        }
        return strRV;
    }
    
    
    
    // it is the caller's responsibility 
    // to alocate enough space in target
    // for the copy to succeed
    private boolean  CopyMonomialsArray
        (Monomial tgt[], // target array of monomials
         int tgt0,       // first index in target array
         Monomial src[], // source array of monomials
         int src0,       // first index in source
         int count)      // how many monomials to copy
    {
        boolean blnRV = true;
        if (tgt.length < tgt0 +count)
        {
            blnRV = false;
        }
        else
        {
            for (int ix = 0, tt = tgt0, ss = src0; ix < count; ++ix, ++tt, ++ss)
            {
                tgt[tt].setCoeffi(src[ss].getCoeffi());
                tgt[tt].setDegree(src[ss].getDegree());
            }              
        }
        return blnRV;
    }
}