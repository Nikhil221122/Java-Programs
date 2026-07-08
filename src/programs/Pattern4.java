public class Pattern4 {
    
        public static void main(String[] args) {
            // 4 3 2 1
            // 3 2 1
            // 2 1
            // 1
            
            int i, j;
            for (i = 4; i >= 1; i--) {

                for (j = i; j >= 1; j-- ) {
                    
                    System.out.print(j + " ");
                    
                }

                System.out.println();
            }

        }
    }

