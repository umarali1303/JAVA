import java.util.*;

class Dublicate1 {

    public static void main(String[] args){
        String s="My name is Umar op";
        String ans="";
        int n=5;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((int)ch>64 && (int)ch<91){
                ans+=ch;
                if(ans.length()==n){
                        System.out.println(ans);
                        ans="";
                }
            }
            else if((int)ch>96 && (int)ch<123){
                ans+=ch;
                if(ans.length()==n){
                        System.out.println(ans);
                        ans="";
                }
            }
        }
        if(ans.length()!=n)
            System.out.println(ans);
    }
}
