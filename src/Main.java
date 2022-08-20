public class Main {
    public static void main(String[] args) {
        System.out.println("Example Two - Переменные");
        //Task One
        System.out.println("Задача 1");
        //Int
        var year = 2022;
        byte typeByte = 127; //1 byte
        short typeShort = 32_767; //2 byte
        int typeInt = 2_147_483_647; //4 byte
        long typeLong = 9_223_372_036_854_775_807L; //8 byte
        //Float
        float typeFloat = 3.1415926F; //4 byte
        double typeDouble = 3.14159265358979323846; //8 byte
        //Char
        char typeChar = 227; //2 byte
        //Boolean
        boolean typeBoolean = year > 2021; // 1 bit

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
        int bananas = 5 * 80;
        int milk = 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int blender = bananas + milk + iceCream + eggs;
        System.out.println("Вес в блендере: " + blender + " грамм");
        float weightBreakfast = blender / 1000F;
        System.out.println("Общий вес завтрака спортсмена: " + weightBreakfast + " кг");
    }
}