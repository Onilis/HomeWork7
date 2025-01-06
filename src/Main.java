public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1 ");
        int accumulation = 15000;
        int totalAmount = 2_459_000;
        int onlyMonths = 0;
        double percent = 1D / 100;
        int summa = 0;
        while (summa < totalAmount) {
            summa += accumulation;
            summa = (int) (summa * (1 + percent));
            onlyMonths++;
            System.out.println("Месяц " + onlyMonths + " сумма накоплений равна " + summa + " рублей");
        }
        System.out.println();

        System.out.println("Задача № 2 ");
        int number = 0;
        while (number <= 9) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();


        System.out.println("Задача № 3 ");
        long initialPopulation = 12000000;
        int natality1000 = 17;
        int mortality1000 = 8;
        int year = 2025;
        for (int i = year; i < year + 10; i++) {
            initialPopulation += initialPopulation * natality1000 / 1000 - initialPopulation * mortality1000 / 1000;
            System.out.println("Год " + year + ", численость населения состовляет " + initialPopulation);
        }

        System.out.println();

        System.out.println("Задача № 4 ");
        double initialDeposit = 15000;
        double targetAmount = 12000000;
        double monthlyInterestRate = 0.07;
        double totalSavings = initialDeposit;
        int months = 0;
        while (totalSavings < targetAmount) {
            months++;
            totalSavings *= (1 + monthlyInterestRate);
            System.out.println("Накопления за " + months + " месяц, составили " + totalSavings);
        }
        System.out.println();

        System.out.println("Задача № 5 ");
        double initialDeposit1 = 15000;
        double targetAmount1 = 12000000;
        double monthlyInterestRate1 = 0.07;
        double totalSavings1 = initialDeposit1;
        int months1 = 0;
        while (totalSavings1 < targetAmount1) {
            months1++;
            totalSavings1 *= (1 + monthlyInterestRate1);
            if (months1 % 6 == 0) {
                System.out.println("Накопления за " + months1 + " месяц, составили " + totalSavings1);
            }
        }
        System.out.println();

        System.out.println("Задача № 6 ");
        double initialDeposit2 = 15000;
        double monthlyInterestRate2 = 0.07;
        double totalSavings2 = initialDeposit2;
        int months2 = 0;
        int totalMonths2 = 9 * 12;
        while (months2 < totalMonths2) {
            months2++;
            totalSavings2 *= (1 + monthlyInterestRate2);
            if (months2 % 6 == 0) {
                System.out.println("Накопления за " + months2 + " месяц, составили " + totalSavings2);
            }
        }
        System.out.println();

        System.out.println("Задача № 7 ");
        int friday = 5;
        int month = 31;
        System.out.println("Сегодня пятница " + friday + " число.");
        while (friday <= month) {
            friday += 7;
            if (friday > month) {
            } else {
                System.out.println("Сегодня пятница " + friday + " число.");
            }
        }
        System.out.println();

        System.out.println("Задача № 8 ");
        int present = 2025;
        int age = 0;
        int past = present - 200;
        int future = present + 100;
        int comet = 79;
        while (age < future) {
            age += comet;
            if (age > past & age < future) {
                System.out.println(age);
            }
        }

        int child = 6;
        if (child < 5) {
            System.out.println(" Если возраст ребенка равен " + child + " то ему нельзя кататься на аттракционе. ");
        }
        if (child > 5 && child <= 14) {
            System.out.println(" Если возраст ребенка равен " + child + " то ему можно кататься на аттракционе в сопровождении. ");
        }
        if (child > 14) {
            System.out.println(" Если возраст ребенка равен " + child + " то ему можно кататься без сопровождения взрослого. ");
        }
    }
}