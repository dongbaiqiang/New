package msytest.m2233;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {
    	int a = 1122,b = 2;
        Sum SS = new Sum();
        int summ = SS.sum(a, b);
        int subb = SS.sub(a, b);
        int mull = SS.mul(a, b);
        int div = SS.div(a, b);
        int square = SS.sqr(a);
    	System.out.println( "a+b="+summ );
    	System.out.println( "a-b="+subb );
    	System.out.println( "a*b="+mull );
    	System.out.println( "a/b："+div );
    	System.out.println( "a的平方是："+square );
    	System.out.println( "a的立方是："+square );
    }
}
