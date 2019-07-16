package GoogleAdvancedProgramming;

//compres(a)=a
//comress(aaa)= a3
//compress(aaabccc)=a3b1c3

public class StringCompression {
    public String compress(String s){
        String out="";
        int sum =1;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i+1)) {
                sum++;
            } else{
                out=out+s.charAt(i)+sum; // not out+=s.charAt(i)+sum;
                sum=1;
            }
        }
        out = out+s.charAt(s.length()-1)+sum;
        return out.length() <s.length() ? out : s;
    }

}
