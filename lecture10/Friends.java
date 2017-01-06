import java.util.Arrays;

class Friends
{

    public static void main(String[] args)
    {
        // PROBLEM:
        // 0 is friends with 1, 2, 3
        // 1 is friends with 2, 3
        // 2 is friends with 0, 1, 3
        // 3 is friends with 0, 2

        // Represent this with a 2-D array:
        // ANS:
        int[][] friends = {
            {  1, 2, 3},
            {  0, 2},
            {  0, 1, 3},
            {  1, 2},
        };

        int[] twosFriends = friends[2];
        System.out.println("Friends of 2:");
        System.out.println(Arrays.toString(twosFriends)); 
    }
}
