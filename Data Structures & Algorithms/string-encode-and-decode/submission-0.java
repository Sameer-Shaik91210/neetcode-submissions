class Solution {

public String encode(List<String> strs) {

    StringBuilder encoded = new StringBuilder();

    for (String str : strs) {
        encoded.append(str.length());
        encoded.append('#');
        encoded.append(str);
    }

    return encoded.toString();
}

public List<String> decode(String s) {

    List<String> result = new ArrayList<>();
    int i = 0;

    while (i < s.length()) {

        int j = i;

        // Find the '#'
        while (s.charAt(j) != '#') {
            j++;
        }

        // Parse the length
        int len = Integer.parseInt(s.substring(i, j));

        // Move to start of actual string
        j++;

        // Extract the string
        String str = s.substring(j, j + len);
        result.add(str);

        // Move i to the next encoded string
        i = j + len;
    }

    return result;
}
}
