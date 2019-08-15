package msytest.m2233;

public class signstring {
//	boolean stringtest(String stringone,String stringtwo){
//		  if(stringone.equals(stringtwo)) {
//			  return true;
//		  }		  
//		  return false;
//	}  
	boolean stringtest(String stringone,String stringtwo){
	  if(stringone.hashCode() == stringtwo.hashCode()) {
		  if(stringone.equals(stringtwo)) {  
			  return true;
		  }
	  }		 
	  return false;
	 
   }  
	boolean stringabc(String string,String sstring) {
		int s = string.indexOf(sstring);
		int s1 = sstring.indexOf(string);
		System.out.println(s);
		System.out.println(s1);
		if(s>=0||s1>=0) {
			return true;
		}
		return false;
	}
}
