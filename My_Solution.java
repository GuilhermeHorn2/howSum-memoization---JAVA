package misc;


public class main_misc {
	//private static long[][] cache = new long[999][999];//
    private static String[] cache = new String[999]; 
	
	public static void main(String[] args) {
		
		//
    int[]v = {7,14};
    int[]s;
    System.out.println(howSum(300,v));
		

		
	}
	private static String howSum(int t,int[]v) {
		if(t == 0){
			return "";
		}
		if(t < 0) {
			return null;
		}
		if(cache[t] != null && cache[t] != "key") {
			return cache[t];
		}
		if(cache[t] == "key") {
			return null;
		}
		for(int i = 0;i < v.length;i++){
			int r = t-v[i];
			String s = howSum(r,v);
			if(r >= 0 && s != null) {
				s += " " + v[i];
				cache[t] = s;
				return s;
			}
		}
		cache[t] = "key";
		return null;
	}
	
	}
	
	

	
		
	
	


	

	
	

