public class Main {
    public static void main(String[] args) {
        System.out.println("Example Two - Variables");

        //Task One
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

        //Task Two
        float fighterOne = 78.2F;
        float fighterTwo = 82.8F;
        float totalWeightFighter = fighterOne + fighterTwo;
        float diffWeightFighter = fighterOne - fighterTwo;
        System.out.println("Общий вес бойцов: " + totalWeightFighter + " кг");
        System.out.println("Разница в весе: " + diffWeightFighter + " кг");
    }
}