package atulier;

public class Fun4 {

	public static void main(String[] args) {
		fun4(0,0);
		
	}
	public static void fun4(int x ,int y){
		if(x > y)
		{
			System.out.println(x+"  est plus grand que " +y);
		}
		
		if(x < y)
		{
			System.out.println(x+" est plus petit que  " +y);
		}
		
		if(x == y){
			System.out.println(x+ " et"+y+" sont identiques ");
		}
		
	}
}
