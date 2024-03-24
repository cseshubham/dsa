package arrays.linearSearch;

public class RichestCustomerWealth {
    // https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        int personWealth[][]= new int[][]{
                {10,12,32},
                {7,4,25},
                {1,9,9}
        };

        int richestWealth=richestPearsonWealth(personWealth);
        System.out.println("richestWealth: "+richestWealth);
    }

    private static int richestPearsonWealth(int[][] personWealth) {
        int richestWealth=Integer.MIN_VALUE;
        for (int person = 0; person < personWealth.length; person++) {
            int personWealthTotal=0;
            for (int wealth = 0; wealth < personWealth[person].length; wealth++) {
                personWealthTotal+=personWealth[person][wealth];
            }
            System.out.println(person+1 + " Person wealth: "+ personWealthTotal);
            if(richestWealth<personWealthTotal){
                richestWealth=personWealthTotal;
            }
        }
        return richestWealth;
    }

}
