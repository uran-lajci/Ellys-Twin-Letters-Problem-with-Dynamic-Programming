public class Test {
    public static void main(String[] args) {
        EllysTwinLetters ellysTwinLetters = new EllysTwinLetters();
        System.out.println(ellysTwinLetters.getMin("TOPCODER")); // 30
        System.out.println(ellysTwinLetters.getMin("ABCDEFGHIJKLMNOPQRSTUVWXYZ")); // 13
        System.out.println(ellysTwinLetters.getMin("ESPRIT")); // 25
        System.out.println(ellysTwinLetters.getMin("WITHOUTITIMJUSTESPR")); // 54
        System.out.println(ellysTwinLetters.getMin("NOZAPHODJUSTVERYVERYIMPROBABLE")); // 93
        System.out.println(ellysTwinLetters.getMin("FROMALLTHETHINGSIVELOSTMYMINDIMISSTHEMOST")); // 111
    }
}
