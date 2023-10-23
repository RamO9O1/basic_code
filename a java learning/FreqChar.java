
public class FreqChar {

    public static void main(String[] args) {
        String sd = "asasqwerrd";
        int count = 0;
        for (int i = 0; i < sd.length(); i++) {
            char vb = sd.charAt(i);
            for (int j = 0; j < sd.length(); j++) {
                char vf = sd.charAt(j);
                if (vf == vb) {
                    count++;
                    continue;
                }
            }
            System.out.println(vb + " = " + count);
        }

    }
}
