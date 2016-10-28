package function;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class function_test {

	public static int cacl(String s) throws Exception{
		if(s == null || "".equals(s.trim())){
			return 0;
		}
		int plus_index = s.indexOf("+");
		int minus_index = s.indexOf("-");
		int mult_index = s.indexOf("*");
		int divide_index = s.indexOf("/");
		if(plus_index == -1 && minus_index == -1 && mult_index == -1 && divide_index == -1){
			return Integer.parseInt(s.trim()); 
		}
		if(plus_index!=-1){
            return cacl(s.substring(0,plus_index))+cacl(s.substring(plus_index+1,s.length()));
        }
        if(minus_index!=-1){
            return cacl(s.substring(0,minus_index))-cacl(s.substring(minus_index+1,s.length()));
        }
        if(mult_index!=-1){
            return cacl(s.substring(0,mult_index))*cacl(s.substring(mult_index+1,s.length()));
        }
        if(divide_index!=-1){
            return cacl(s.substring(0,divide_index))/cacl(s.substring(divide_index+1,s.length()));
        }
        return Integer.parseInt(s.trim());
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader inputStreamReader = null;
		BufferedReader reader = null;
		try {
			inputStreamReader = new InputStreamReader(System.in);
			reader = new BufferedReader(inputStreamReader);
			String s = reader.readLine();
//			System.out.println(s);
			System.out.println(cacl(s));
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(reader != null){
			try{
				reader.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
