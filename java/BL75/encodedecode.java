import java.util.*;

class encodedecode {

    public static String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();

        for (String s : strs) {
            res.append(s.length()).append("#").append(s);
        }

        return res.toString();
    }

    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;

            j = i + length;
            res.add(str.substring(i, j));

            i = j;
        }

        // printing
        for (String s : res) {
            System.out.println(s);
        }

        return res;
    }

    public static void main(String args[]) {
        String lis[] = {"neet", "code"};

        String res = encode(Arrays.asList(lis)); // ✅ fixed
        decode(res);
    }
}

