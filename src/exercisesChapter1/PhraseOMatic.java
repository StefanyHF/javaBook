package exercisesChapter1;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"web-based", "smart", "dynamic", "front end", "pervasive"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "cooperative", "shared", "mindshare", "portal"};
        String[] wordListThree = {"process", "mission", "focused", "aligned", "paradigm"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a " + phrase);
    }
}
