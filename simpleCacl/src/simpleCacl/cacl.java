package simpleCacl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cacl {

	public static void main(String[] args){
         
        BufferedReader reader=null;
        InputStreamReader inputStreamReader=null;
        try{
            inputStreamReader=new InputStreamReader(System.in);
            reader=new BufferedReader(inputStreamReader);
            String str=reader.readLine();
            System.out.println(opt(str));
        }catch(Exception e){
            e.printStackTrace();
        }
        if(reader!=null){
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
     
    public static int opt(String s) throws Exception{
        if(s == null || "".equals(s.trim())) {
            return 0;
        }
        int a1=s.indexOf("+");
        int a2=s.indexOf("-");
        int a3=s.indexOf("*");
        int a4=s.indexOf("/");
        if(a1==-1&&a2==-1&&a3==-1&&a4==-1){
            if(s.trim()==null||"".equals(s.trim())){
                throw new Exception("operate error");
            }
            return Integer.parseInt(s.trim());
        }
         
        if(a1!=-1){
            return opt(s.substring(0,a1))+opt(s.substring(a1+1,s.length()));
        }
        if(a2!=-1){
            return opt(s.substring(0,a2))-opt(s.substring(a2+1,s.length()));
        }
        if(a3!=-1){
            return opt(s.substring(0,a3))*opt(s.substring(a3+1,s.length()));
        }
        if(a4!=-1){
            return opt(s.substring(0,a4))/opt(s.substring(a4+1,s.length()));
        }
        return Integer.parseInt(s.trim());
    }

}