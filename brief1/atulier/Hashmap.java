package atulier;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
	    HashMap<String,Integer> p�rson = new HashMap<String, Integer>();
	    
	    p�rson.put("Ali", 14);
	    p�rson.put("Mohammed", 16);
	    p�rson.put("Fatima", 21);

	    System.out.println(p�rson);
	    //size
	    System.out.println(p�rson.size());
	    //copier
	    HashMap<String,Integer> p�rson2 = new HashMap<String, Integer>();
	    
	    p�rson2.putAll(p�rson);
	    
	    System.out.print(p�rson2);
	    System.out.println("\r");
	    //delete
	    p�rson2.remove("Mohammed",16);
	    System.out.println(p�rson2);
	   
	}

}
