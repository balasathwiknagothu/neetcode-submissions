class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())  return false;
        HashMap<Character,Integer> map=new HashMap<>();
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        for(char c:s1){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t1){
            if(!map.containsKey(c)) return false;
            map.put(c,map.get(c)-1);
            if(map.get(c)<0)    return false;
        }
        
        return true;
    }
}
