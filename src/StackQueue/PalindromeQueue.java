package StackQueue;

public class PalindromeQueue {
    String string;


    public PalindromeQueue(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public boolean checkPalindrome(int i, int j) {
        while (i < this.string.length() / 2) {
            if (this.string.charAt(i) != this.string.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
                this.checkPalindrome(i, j);
            }

        }
        return true;
    }
}
