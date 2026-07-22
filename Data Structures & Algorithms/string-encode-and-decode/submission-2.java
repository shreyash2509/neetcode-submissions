class Solution {
    public String encode(List<String> strs) {
        StringBuilder str1=new StringBuilder(); 

        for(String str:strs){ 
            str1.append(str.length()).append("#").append(str);
        }

        return str1.toString();
    }
    public List<String> decode(String str) {
        
        List<String> res=new ArrayList<>(); 
        int i=0,j=0;
        while(i<str.length()){ 
            j=str.indexOf("#",i); 
            int len=Integer.parseInt(str.substring(i,j)); 

            i=j+1; 
            String res1=str.substring(i,i+len); 
            res.add(res1);
            i+=len;
        }
        return res;
    }
}
