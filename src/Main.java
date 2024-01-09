public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello World!");
        // TODO call shouldWakeup
        // Target 1

//        System.out.println("case 1: " + shouldWakeUp(true,1));
//        System.out.println("case 2: " + shouldWakeUp(false ,2));
//        System.out.println("case 3: " + shouldWakeUp(true,8));
//        System.out.println("case 4: " + shouldWakeUp(true,-1));

        // Target 2
//        System.out.println("case 1:" + hasTeen(9, 99, 19));
//        System.out.println("case 2:" + hasTeen(23, 15, 42));
//        System.out.println("case 3:" + hasTeen(22, 23, 34));

        // Target 3
//        System.out.println(isCatPlaying(true, 10));
//        System.out.println(isCatPlaying(false, 36));
//        System.out.println(isCatPlaying(false, 35));

        // Target 4
//        System.out.println(area(5.0,4.0));
//        System.out.println(area(-1.0, 4.0));
        System.out.println(area(5.0));
        System.out.println(area(-1));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock){
        if(clock < 0 || clock > 23 || !isBarking) return false;
        return clock < 8 || clock >= 20;
    }

    public static boolean hasTeenFirst(int age1, int age2, int age3) {
        return (age1>=13 && age1<=19) || (age2>=13 && age2<=19) || (age3>=13 && age3<=19);
    }

    public static boolean hasTeen(int... ages) {
        if (ages.length != 3) {
            return false;
        }
        for(int age: ages) {
            if(age>=13 && age<=19) return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if (isSummer) {
            return temperature > 25 && temperature <= 45;
        }
        return temperature > 25 && temperature <= 35;
    }

    public static double area(double height, double width){
        if(width<0 || height<0) {
            System.out.println("width or height cannot be less than zero!");
            return -1;
        }
        return width*height;
    }

    public static double area(double radius) {
        if(radius<0) {
            System.out.println("radius of circle cannot be lass than zero! radius parameter: " + radius);
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }
}