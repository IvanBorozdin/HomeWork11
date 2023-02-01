import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        isYearLeap(2023);
        isYearLeap(2000);
        isYearLeap(2008);

        determineOSVersion(0,2017);
        determineOSVersion(0,2023);

        determineOSVersion(1,2013);
        determineOSVersion(1,2023);

        int time1 = calculateTime(10);
        int time2 = calculateTime(50);
        int time3 = calculateTime(100);
        int time4 = calculateTime(1000);
        System.out.println("Дистанция 20 = " +time1);
        System.out.println("Дистанция от 20 до 60 = "+time2);
        System.out.println("Дистанция от 60 до 100 = "+time3);
        System.out.println("Дистанция свыше 100 = "+time4);


    }



    public static void isYearLeap(int year){
        if (year % 4 == 0 && year % 100 != 0  || year % 400 ==0){
            System.out.println(year + " год - высокостный ");
        } else {
            System.out.println(year + " год - не высокостный ");

    }
    }
    public static void determineOSVersion (int osType, int deviceYear){
        int currentYear = LocalDate.now().getYear();
        if (osType == 0){
            if (deviceYear == currentYear){
                System.out.println("Устанавить обычную iOS");
            }else {
                System.out.println("Устанавить облегченную iOS");
            }

        }else {
            if (deviceYear == currentYear){
                System.out.println("Устанавить обычную Android");
            }else {
                System.out.println("Устанавить облегченную Android");

        }

    }
}

    public static int calculateTime(int distance){
        int time = 1;
        if (distance>= 20 && distance<=60){
            ++time;
        }
        if (distance >60 && distance<=100){
            ++time;
        }
        if (distance>100){
            return -1;
        }

        return time;

    }
}