package atulier;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
	    HashMap<String,Integer> pérson = new HashMap<String, Integer>();
	    
	    pérson.put("Ali", 14);
	    pérson.put("Mohammed", 16);
	    pérson.put("Fatima", 21);

	    System.out.println(pérson);
	    //size
	    System.out.println(pérson.size());
	    //copier
	    HashMap<String,Integer> pérson2 = new HashMap<String, Integer>();
	    
	    pérson2.putAll(pérson);
	    
	    System.out.print(pérson2);
	    System.out.println("\r");
	    //delete
	    pérson2.remove("Mohammed",16);
	    System.out.println(pérson2);
	   
	}

}
