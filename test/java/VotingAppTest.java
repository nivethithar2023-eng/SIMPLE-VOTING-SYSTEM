public class VotingAppTest {

    public static void main(String[] args) {

        // Reset values
        VotingApp.voters.clear();
        VotingApp.voteCount = 0;

        // Test duplicate vote
        VotingApp.vote("user1");
        String result = VotingApp.vote("user1");

        if (result.equals("Duplicate Vote!")) {
            System.out.println("Test Passed: Duplicate prevented");
        } else {
            System.out.println("Test Failed");
        }

        // Test vote count
        VotingApp.vote("user2");

        if (VotingApp.voteCount == 2) {
            System.out.println("Test Passed: Count correct");
        } else {
            System.out.println("Test Failed");
        }
    }
}