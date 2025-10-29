class Solution {
    public boolean areNumbersAscending(String s) {
        int num=-1;
        String words[]=s.split(" ");
        for(int i=0;i<words.length;i++){
            String a=words[i];
            if(a.matches("\\d+")) { 
                int j = Integer.parseInt(a);
                if(num<j) num=j;
                else return false;
            }
        }
       // System.out.println(Arrays.toString(words));
        return true;
    }
}