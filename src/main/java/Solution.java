import java.util.HashSet;
import java.util.List;

public class Solution {
    public static int maxTickets(List<Integer> tickets) {
        // Using a HashSet to store unique ticket numbers
        HashSet<Integer> ticketSet = new HashSet<>(tickets);

        int longestStreak = 0;

        // Iterate through each unique ticket
        for (int ticket : ticketSet) {
            // Check if it's the start of a sequence
            if (!ticketSet.contains(ticket - 1)) {
                int currentTicket = ticket;
                int currentStreak = 1;

                // Count the length of the consecutive sequence
                while (ticketSet.contains(currentTicket + 1)) {
                    currentTicket++;
                    currentStreak++;
                }

                // Update longest streak if necessary
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    // Example usage
    public static void main(String[] args) {
        List<Integer> tickets = List.of(5, 10, 12, 1, 10, 4);
        System.out.println("Length of Longest Consecutive Sequence: " + maxTickets(tickets));
    }
}
