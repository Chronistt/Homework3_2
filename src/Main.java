public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
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
        short totalPers = (short) (group3 + group1 + group2);
        short totalPap = 480;
        double paper = totalPap / totalPers;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");

    }
}