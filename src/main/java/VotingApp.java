import java.util.HashSet;
import java.util.Set;

public class VotingApp {

    static Set<String> voters = new HashSet<>();
    static int voteCount = 0;

    public static String vote(String voterId) {
        if (voters.contains(voterId)) {
            return "Duplicate Vote!";
        }
        voters.add(voterId);
        voteCount++;
        return "Vote Counted";
    }

    public static void main(String[] args) {

        System.out.println(vote("user1"));
        System.out.println(vote("user2"));
        System.out.println(vote("user1")); // duplicate

        System.out.println("Total Votes: " + voteCount);
    }
}