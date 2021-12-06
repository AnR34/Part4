// с рекурсией
class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] array = string.split(" ");
        if (array.length == 2
                && array[1].replaceAll("[0-9]", "").length() == 0
                && array[1].length() > 1
                && array[1].length() < 6) {
            int sum = sumOfDigit(Integer.parseInt(array[1]));
            if (sum <= 10) System.out.printf("Здравствуй %s! Сумма цифр в числе = %d", array[0], sum);
        } else {
            System.out.println("Введены недопустимые данные");
        }
    }
    private static int sumOfDigit(int n) {
        if (n == 0) return 0;
        return (n % 10 + sumOfDigit(n / 10));
    }
}

// без рекурсии
class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] array = string.split(" ");
        if (array.length == 2
                && array[1].replaceAll("[0-9]", "").length() == 0
                && array[1].length() > 1
                && array[1].length() < 6) {
            int sum = Arrays.stream(array[1].split("")).mapToInt(Integer::parseInt).sum();
            if (sum <= 10) System.out.printf("Здравствуй %s! Сумма цифр в числе = %d", array[0], sum);
        } else {
            System.out.println("Введены недопустимые данные");
        }
    }
}
