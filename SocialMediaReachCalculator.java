public class SocialMediaReachCalculator {

    private static final double AVERAGE_REACH_RATE = 0.25; // 25% average reach rate
    private static final double AVERAGE_IMPRESSIONS_MULTIPLIER = 1.8; // 1.8 times reach

    public static void main(String[] args) {
        int followers = 10000; // Example number of followers
        int reach = calculateReach(followers);
        int impressions = calculateImpressions(reach);

        System.out.println("Followers: " + followers);
        System.out.println("Estimated Reach: " + reach);
        System.out.println("Estimated Impressions: " + impressions);
    }

    public static int calculateReach(int followers) {
        return (int) (followers * AVERAGE_REACH_RATE);
    }

    public static int calculateImpressions(int reach) {
        return (int) (reach * AVERAGE_IMPRESSIONS_MULTIPLIER);
    }
}
