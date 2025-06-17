public class ArrayChallenge {
    
    public static void main(String[] args) {
        String[] orderIds = {"B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179"};

        for (String item : orderIds) {
            if (item.startsWith("B")) {
                System.out.println(item);
            }
        }
    }
}

