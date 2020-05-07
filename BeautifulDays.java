package com.company;

public class BeautifulDays {
    public static void main(String[] args) {
        int q=beautifulDays(13,45,3);
        System.out.println(q);
    }

    static int beautifulDays(int i, int j, int k) {
        int count = 0;

        for (int a=i;j>=a; a++){
            StringBuilder temp = new StringBuilder();
            temp.append(a);
            temp=temp.reverse();
            String temp1 = temp.toString();
            int aRev = Integer.parseInt(temp1);
            if(Math.abs((a-aRev)%k)==0){
                count++;
            }
        }
        return count;
    }
}
