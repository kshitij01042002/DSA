package Leetcode.Strings;

public class Problem1108 {
    public static void main(String[] args) {
        
    }

    public static String defangIPaddr(String address) {
        if(address != null && address.length() > 0) {
            return address.replace(".", "[.]");
        }
        return null;
    }
}
