class Solution {
    public String sortSentence(String s) {
       String [] words=s.trim().split(" ");
       String ans="";
       String [] w=new String[words.length];
       for(int i=0;i<words.length;i++){
        String x=words[i];
        int j=x.charAt(x.length()-1)-'0';
        w[j-1]=x.substring(0,x.length()-1);
       }
      //System.out.println(Arrays.toString(w));
       ans=String.join(" ",w);
       return ans;
    }
}