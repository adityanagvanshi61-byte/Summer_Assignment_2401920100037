class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        boolean is_first = true;
        int i =0;
        while(i<s.length()){
            if (s.charAt(i)==' ') i++;
            else{
                while(i< s.length() && s.charAt(i)!=' '){
                    temp.append(s.charAt(i));
                    i++;
                }
                String temp1 = temp.reverse().toString();
                if (is_first){
                    ans.append(temp1);
                    is_first=false;
                }
                else{
                    ans.append(" "+temp1);
                }
                temp.setLength(0);
            }
        }
        return ans.toString();
        
    }
}
