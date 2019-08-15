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
        signstring stringsign = new signstring();
        int summ = SS.sum(a, b);
        int subb = SS.sub(a, b);
        int mull = SS.mul(a, b);
        int div = SS.div(a, b);
        int square = SS.sqr(a);
        int square3 = SS.sqr3(a);
        String stringone = "as";
        String stringtwo = "asdfg";
      //  int h = stringsign.stringtest(stringone, stringtwo);
       boolean h = stringsign.stringabc(stringone, stringtwo);
//    	System.out.println( "a+b="+summ );
//    	System.out.println( "a-b="+subb );
//    	System.out.println( "a*b="+mull );
//    	System.out.println( "a/b："+div );
//    	System.out.println( "a的平方是："+square );
//    	System.out.println( "a的立方是："+square3 );
//    	System.out.println( h);
       
       String s = "abc";
       String ss = "abababc";
       String sss[] = s.split("");
       System.out.println(sss[1]);
    }
}
