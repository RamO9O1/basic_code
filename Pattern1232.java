class Patter1232 {
    public static void main(String[] args) {
        int a = 5;
        int x = 1;
        for (int i = 1; i <= a * 2; i++) {
            if (i % 2 != 0) {
                int tep = x;
                int cot = 0;
                for (int j = a * 2; j > 0; j--) {
                    if (j <= i) {
                        cot++;
                        if (i <= 1) {
                            System.out.print((tep) + " ");
                        } else {
                            if (cot <= Math.floor(i / 2)) {
                                System.out.print((tep++) + " ");
                            } else {
                                System.out.print((tep--) + " ");

                            }
                        }
                    } else {
                        System.out.print(" ");
                    }
                }

                x++;
                System.out.println();
            }

        }

    }

}