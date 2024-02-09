package TotalJava.Recursion;

// either friend can stand in pair or single , find the number of ways that a friends can stand
public class FriendsPairing {
    public static void main(String[] args){
        System.out.println(friendPairing(3));
    }

    public static int friendPairing(int n) {
        if(n==1||n==2){
            return n;
        }

        int nm1 = friendPairing(n-1);
        int nm2 = friendPairing(n-2);
        int pairways = n-1 * nm2;
        return nm1 + pairways ;
    }
}
