package atulier;

import java.util.HashMap;

public class Hash19 {

	public static void main(String[] args) {
	    HashMap<String,Integer> pérson = new HashMap<String, Integer>();
	    
	    pérson.put("Ali", 14);
	    pérson.put("Mohammed", 16);

	    System.out.println(pérson);
	    System.out.println(pérson.size());
	    
	    HashMap<String,Integer> pérson2 = new HashMap<String, Integer>();
	    
	    pérson2.putAll(pérson);
	    
	    System.out.print(pérson2);
	    pérson2.remove("Mohammed",14);
	    System.out.println(pérson2);
	   
	}

}
