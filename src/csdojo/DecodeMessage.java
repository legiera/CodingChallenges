package csdojo;
//link: https://www.youtube.com/watch?v=qli-JCrSwuk
// Facebook Coding Interview Question - How Many Ways to Decode This Message?
// a -> 1
//b -> 2 ..

// analysis
// 1. starts with 0 then 0
//2. is empty then 1
// 3. double recursion num_ways(12345)= num_ways(2345)+ num_ways(345)
//4. single recursion num_ways(27345)= num_ways(7345)
public class DecodeMessage {

    public int numwWays(String data){

        return helper(data, data.length());
    }

    public int helper(String data, int count){
        //count - number o letters counted from ens

        // basics
        if(count==0)
            return 1;
        //int s = data.length() - count;
        //data[s]=='0'
        if(data.startsWith("0"))
            return 0;

        //recursion
        int result = helper(data, count-1);

        if(count>=2 && Integer.parseInt(data.substring(0,2))<=26)
            result +=helper(data, count-2);

        return result;



    }

}
