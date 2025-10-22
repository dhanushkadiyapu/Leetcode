class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb);
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            if(s.contains((t.charAt(i)+""))) {
                int index = sb.indexOf(String.valueOf(t.charAt(i))); // convert char to String
                if (index != -1) {
                sb.deleteCharAt(index);
                }
            }
            else return false;
        }
        return sb.length()==0?true:false;
    }
}