public class Main {
    public static void main(String[] args) {
        System.out.println("Example Two - Переменные");
        //Task One
        System.out.println("Задача 1");
        //Int
        var year = 2022;
        byte tByte = 127; //1 byte
        short tShort = 32_767; //2 byte
        int tInt = 2_147_483_647; //4 byte
        long tLong = 9_223_372_036_854_775_807L; //8 byte
        //Float
        float tFloat = 3.1415926F; //4 byte
        double tDouble = 3.14159265358979323846; //8 byte
        //Char
        char tChar = 227; //2 byte
        //Boolean
        boolean tBoolean = year > 2021; // 1 bit

        System.out.println("******************************************");
        //Task Two
        System.out.println("Задача 2");
        float fighterOne = 78.2F;
        float fighterTwo = 82.8F;
        float totalWeightFighter = fighterOne + fighterTwo;
        float diffWeightFighter = fighterOne - fighterTwo;
        System.out.println("Общий вес бойцов: " + totalWeightFighter + " кг");
        System.out.println("Разница в весе бойцов: " + diffWeightFighter + " кг");

        System.out.println("******************************************");
        //Task 3
        System.out.println("Задача 3");
        short bananas = 5 * 80;
        short milk = 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int blender = bananas + milk + iceCream + eggs;
        System.out.println("Вес в блендере: " + blender + " грамм");
        float weightBreakfast = blender / 1000F;
        System.out.println("Общий вес завтрака спортсмена: " + weightBreakfast + " кг");

        System.out.println("******************************************");
        //Task 4
        System.out.println("Задача 4");
        short loseWeightSportsman = 7 * 1000;
        short dietLow = 250;
        short dietFast = 500;
        int dietLowDay = loseWeightSportsman / dietLow;
        System.out.println("Для умеренного похудения на 7 кг спортсмену потребуется - " + dietLowDay + " дней.");
        int dietFastDay = loseWeightSportsman / dietFast;
        System.out.println("Для быстрого похудения на 7 кг спортсмену потребуется - " + dietFastDay + " дней.");
        int dietAverageDay = ( dietLowDay + dietFastDay ) / 2;
        System.out.println("В среднем для похудения на 7 кг спортсмену потребуется - " + dietAverageDay + " день.");

    }
}