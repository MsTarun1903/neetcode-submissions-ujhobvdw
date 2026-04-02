class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        do{
        int rem = x % 10;
        rev = rev * 10 + rem;
        x = x / 10;
        }while(x!=0);
        if(rev<0) return false;
        return rev == temp;
    }
}