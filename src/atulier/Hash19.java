package atulier;

import java.util.HashMap;

public class Hash19 {

	public static void main(String[] args) {
	    HashMap<String,Integer> p�rson = new HashMap<String, Integer>();
	    
	    p�rson.put("Ali", 14);
	    p�rson.put("Mohammed", 16);

	    System.out.println(p�rson);
	    System.out.println(p�rson.size());
	    
	    HashMap<String,Integer> p�rson2 = new HashMap<String, Integer>();
	    
	    p�rson2.putAll(p�rson);
	    
	    System.out.print(p�rson2);
	    p�rson2.remove("Mohammed",14);
	    System.out.println(p�rson2);
	   
	}

}
