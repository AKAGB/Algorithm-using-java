public class DetectCapital {
    public static void main(String[] args) {
        DetectCapital obj = new DetectCapital();
        System.out.println(obj.detectCapitalUse("FlaG"));
    }

    public boolean detectCapitalUse(String word) {
        boolean flag = true, allUp = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) - 'A' <= 25 && word.charAt(i) - 'A' >= 0) {
                allUp = allUp & true;
                if (i != 0) {
                    flag = false;
                }
            } else {
                allUp = false;
            }
        }
        return allUp || flag;
    }
}
