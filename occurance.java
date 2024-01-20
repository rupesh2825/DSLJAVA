public class prints {
    static int first = -1;
    static int last = -1;

    public static void printrev(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(idx);
        if (currchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        printrev(str, idx + 1, element);
    }

    public static void main(String args[]) {
        String str = "abaacdeaefaah";
        printrev(str, 0, 'e');

    }
}
