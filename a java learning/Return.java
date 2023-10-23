class Return {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before return");
        if (a == 10) {
            System.out.println("hii");
            if (a == 10) {
                return;
            }

        }
        System.out.println("After return");
    }
}