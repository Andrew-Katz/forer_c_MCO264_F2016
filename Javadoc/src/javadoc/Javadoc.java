/**
 *  A copyright might go here....
 */
package javadoc;

/************************************************
 *  This program is meant to illustrate javadoc 
 * @author  Andrew Katz
 * @since   2016-11-07
 * @version 1.1
 ************************************************/
public class Javadoc
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /** Inane function is used purely to show this comment */
        int dummy = InaneFunction(1);
        System.out.println("InaneFunction returned " + dummy);
    }
    
    /**
     * InaneFunction does not do very much
     * @param dummy is doubled and returned
     * @return doubled argument provided
     */
    public static int InaneFunction(int dummy)
    {
        return 2 * dummy;
    }
}
//-------------------> end of file
