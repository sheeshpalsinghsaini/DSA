package recursion;

public class FriendsPairing {
    
    public static int friendPairing(int n){
        if(n==1 || n==2)
            return n;
        
        //condition for standing single friend
        int single = friendPairing(n-1);

        //conditon for pairing
        int pairing = (n-1)*friendPairing(n-2);

        //total ways 
        int total = single+pairing;
        return total;
    }
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println(friendPairing(3));

    }
}

/*
 * in a party there are n fiends, they can standup single or making a pair by 1-1.
 * print how many ways are there for pairing and standup single.
 */
