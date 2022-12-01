public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
    }
    public static void task1 () {
        System.out.println("Task 1");
        byte castle = 25;
        System.out.println("Значение переменной castle с типом byte равно " + castle);
        short byzCastle = 29000;
        System.out.println("Значение переменной byzCastle с типом short равно " + byzCastle);
        int arlesCastle = 203049485;
        System.out.println("Значение переменной arlesCastle с типом int равно " + arlesCastle);
        long kolnCastle = 3029L;
        System.out.println("Значение переменной kolnCastle с типом long равно " + kolnCastle);
        float egCastle = 30f;
        System.out.println("Значение переменной egCastle с типом float равно " + egCastle);
        double arabCastle = 29.03;
        System.out.println("Значение переменной arabCastle с типом double равно " + arabCastle);
    }
    public static void task2 () {
        System.out.println("Task 2");
        float ring = 27.12f;
        long line = 987678965549L;
        float string = 2.786f;
        short point = 569;
        short rule = -159;
        short run = 27897;
        byte dog = 67;
    }

    public static void task3 () {
        System.out.println("Task 3");
        byte group1 = 23;
        byte group2 = 27;
        byte group3 = 30;
        short totalPers = (short) (group3 + group2 + group1);
        short totalPap = 480;
        double paper = totalPap / totalPers;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");

    }
    public static void task4 () {
        System.out.println("Task 4");

        byte outputInit = 16;
        byte timeInit = 2;
        byte output = (byte) (outputInit / timeInit);
        byte time1 = 20;
        short time2 = 60 * 24;
        short time3 = (short) (time2 * 3);
        int time4 = (int) (time2 * 30);

        short output1 =  (short) (output * time1);
        System.out.println("За 20 минут машина произвела " + output1 + " штук бутылок");

        short output2 = (short) (output * time2);
        System.out.println("За сутки машина произвела " + output2 + " штук бутылок");

        int output3 = (int) (output * time3);
        System.out.println("За 3 дня машина произвела " + output3 + " штук бутылок");

        int output4 = (int) (output * time4);
        System.out.println("За месяц машина произвела " + output4 + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Task 5");
    byte tinTotal = 120;
    short tinClass = 6;
    short classes = (short) (tinTotal / tinClass);
    short tinWhite = (short) (classes * 2);
    short tinBrown = (short) (classes * 4);
        System.out.println("В школе, где " + classes + " классов, нужно " + tinWhite + " банок белой краски и " + tinBrown + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Task 6");
        byte banana = 5;
        byte massBanana = 80;
        short totBanana = (short) (massBanana * banana);
        byte milk = 2;
        byte massMilk = 105;
        short totMilk = (short) (massMilk * milk);
        byte icecr = 2;
        byte massIcecr = 100;
        short totIcecr = (short) (icecr * massIcecr);
        byte egg = 4;
        byte massEgg = 70;
        short totEgg = (short) (egg * massEgg);

        short lunchG = (short) (massBanana + massMilk + massIcecr + massEgg);
        float lunchKg = (float) (lunchG / 1000f);

        System.out.println("Вес завтрака " + lunchG + " г. То есть, " + lunchKg + " кг");

    }

    public static void task7 () {
        System.out.println("Task 7");
        float massTotLoss = 7f;
        float massLoss1 = 0.5f;
        float massLoss2 = 0.25f;
        byte days1 = (byte) (massTotLoss / massLoss1);
        byte days2 = (byte) (massTotLoss / massLoss2);
        byte daysAverage = (byte) ((days2 + days1)/2);
        System.out.println("На похудение 500 г в день нужно " + days1 + " дней");
        System.out.println("На похудение 250 г в день нужно " + days2 + " дней");
        System.out.println("На похудение в среднем нужно " + daysAverage + " дней");
    }

    public static void task8 () {
        System.out.println("Task 8");
        int wageMary1 = 67760;
        int wageDenis1 = 83690;
        int wageChris1 = 76230;
        float wageMary2 = wageMary1 + wageMary1*0.1f;
        float wageDenis2 = wageDenis1 + wageDenis1*0.1f;
        float wageChris2 = wageChris1 + wageChris1*0.1f;

        float diffMary = (wageMary2 - wageMary1)*12;
        float diffDenis = (wageDenis2 - wageDenis1)*12;
        float diffChris = (wageChris2 - wageChris1)*12;

        System.out.println("Денис теперь получает " + wageDenis2 + " рублей. Годовой доход вырос на " + diffDenis+ " рублей");
        System.out.println("Кристина теперь получает " + wageChris2 + " рублей. Годовой доход вырос на " + diffChris + " рублей");
        System.out.println("Маша теперь получает " + wageMary2 + " рублей. Годовой доход вырос на " + diffMary + " рублей");



    }
}