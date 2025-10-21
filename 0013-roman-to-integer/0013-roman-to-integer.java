class Solution {
    public int romanToInt(String s) {
        HashMap <Character,Integer> HP =new HashMap<>();
        int ans=0;
        HP.put('I',1);
        HP.put('V',5);
        HP.put('X',10);
        HP.put('L',50);
        HP.put('C',100);
        HP.put('D',500);
        HP.put('M',1000);
        ans+=HP.get(s.charAt(s.length()-1));
        for(int i=0;i<s.length()-1;i++){
            int x=HP.get(s.charAt(i));
            int y=HP.get(s.charAt(i+1));
            if(x>=y) ans+=x;
            else ans-=x;
        }
        return ans;
    }
}