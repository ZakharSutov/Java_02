public class StringProcessor {
    public String num1(String s, int n) {
        String str = "";
        if (n < 0) throw new IllegalArgumentException("n < 0");
        for (int i = 0; i < n; i++) {
            str += s;
        }
        return str;
    }

    public int num2(String s1, String s2) {
        int n = 0;
        int count = -1;
        try {
            if (s2 == null || s2.equals("")) {
                throw new NullException("Вторая сторока пустая или Null.");
            }
            while (n != -1) {
                n = s1.indexOf(s2, n);
                if (n >= 0) n++;
                count++;
            }
        } catch (NullException e) {
            System.err.println(e.getMessage());
        }
        return count;
    }

    public String num3(String s) {
        int n;
        String str = "";
        String[] arr = s.split("1");
        n = arr.length;
        str += arr[0];
        for (int i = 1; i < n; i++) {
            str += "один";
            str += arr[i];
        }
        if (s.endsWith("1")) {
            str += "один";
        }

        s = "";
        arr = str.split("2");
        n = arr.length;
        s += arr[0];
        for (int i = 1; i < n; i++) {
            s += "два";
            s += arr[i];
        }
        if (str.endsWith("2")) {
            s += "два";
        }

        str = "";
        arr = s.split("3");
        n = arr.length;
        str += arr[0];
        for (int i = 1; i < n; i++) {
            str += "три";
            str += arr[i];
        }
        if (s.endsWith("3")) {
            str += "три";
        }
        return str;
    }

    public StringBuilder Num4(StringBuilder str) {
        int n;
        for (int i = 1; i < str.length(); i++) {
            str.delete(i, i + 1);
        }
        return str;
    }
}

