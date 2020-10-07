import java.util.Scanner;

public class ServerNameGenerator {
   static String[] adjectives = {
            "bold",
            "shaggy",
            "swanky",
            "messy",
            "goofy",
            "inquisitive",
            "enchanted",
            "angry",
            "happy",
            "exotic"};

   static String[] nouns = {
            "glass",
            "snake",
            "calculator",
            "rock",
            "stitch",
            "hill",
            "partner",
            "sign",
            "division",
            "friend"
    };

    public static int randomize(int n) {
        return (int) (Math.random() * n) + 1;
    }

    public static void randomName(String[] arr1, String[] arr2) {
        int n = 9;
        int randomNum = randomize(n);
        int randomNum2 = randomize(n);

        String adjective = arr1[randomNum];
        String noun = arr2[randomNum2];

        System.out.print("Here's your server name: \n");
        System.out.println(adjective + "-" + noun);
    }

    public static void main(String[] args) {
        randomName(adjectives, nouns);
    }
}

