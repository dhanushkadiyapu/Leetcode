class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        Set<Character> ans=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            ans.add(sentence.charAt(i));
        }
        return ans.size()==26;
    }
}