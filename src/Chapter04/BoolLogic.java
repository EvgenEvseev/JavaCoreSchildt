package Chapter04;

public class BoolLogic {
    public static void main(String args[]){
        boolean a=true,b=false,c=a|b,d=a&b,e=a^b,f=(!a&b)|(a&!b),g=!a;
        System.out.println("a = "+a+"\nb = "+b+"\na|b = "+c+"\na&b = "+d+"\na^b = "+e+"\n!a&b|a&!b = "+f+"\n!a = "+g);
    }
}
