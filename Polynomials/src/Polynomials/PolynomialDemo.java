package Polynomials;

public class PolynomialDemo
{

    public static void main(String[] args)
    {
        Monomial one = new Monomial(2, 3);
        Monomial two = new Monomial(3, 5);
        Monomial three = new Monomial(5, 6);
        Monomial[] polynomial = new Monomial[]
        {
            three, two, one
        };
        Polynomial poly = new Polynomial(3);
        poly.setPolynomial(polynomial);

        for (int ii = 0; ii < poly.getInUse(); ii++)
        {
            System.out.println(poly.Show(ii));
        }
        Monomial four = new Monomial(4, 2);
        System.out.println("\n");
        if (poly.Insert(four) == true)
        {

            for (int ii = 0; ii < poly.getInUse(); ii++)
            {
                System.out.println(poly.Show(ii));
            }
        }
    }
}
