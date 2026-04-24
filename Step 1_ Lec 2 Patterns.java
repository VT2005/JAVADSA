class Patterns {
    // 1. Square Star Pattern
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Right Triangle Star Pattern
    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Right-Angled Number Pyramid
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 4. Right-Angled Number Pyramid (repeated numbers)
    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // 5. Inverted Right Star Pyramid
    public static void pattern5(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 6. Inverted Numbered Right Pyramid
    public static void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 7. Star Pyramid
    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            int spaces = n - i - 1;
            int stars = 2 * i + 1;
            for (int s = 0; s < spaces; s++) System.out.print(" ");
            for (int st = 0; st < stars; st++) System.out.print("*");
            for (int s = 0; s < spaces; s++) System.out.print(" ");
            System.out.println();
        }
    }
}
