public class Batsman {
    String name;
    String country;
    int score;
    int balls;
    float strikeRate;

    Batsman(String name, String country, int score, int balls) {
        this.name = name;
        this.country = country;
        this.score = score;
        this.balls = balls;
    }

    void calculateStrikeRate() {
        strikeRate = ((float) score / balls) * 100;
    }

    void display() {
        calculateStrikeRate();
        System.out.println("Player name is " + name);
        System.out.println("Country is " + country);
        System.out.println("Runs scored in todays match " + score);
        System.out.println("Balls played in todays match " + balls);
        System.out.println("Strike Rate " + strikeRate);
    }

    public static void main(String args[]) {

        Batsman o1 = new Batsman("Rinku Singh", "Bharat", 31, 9);
        o1.display();
    }
}
