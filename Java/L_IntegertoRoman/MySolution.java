package Tech.L_IntegertoRoman;

public class MySolution {

    public static void main(String args[]){

       // int number = 123; // CXXIII

        int number = 2999; //MMCMXCIX

        System.out.println("Roman number : "+intToRoman(number));
    }

    private static String intToRoman(int number) {

        String units[] = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};

        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};

        String hundreds[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"};

        String thousands[] = {"", "M","MM","MMM"};

        return thousands[number/1000]
                +hundreds[(number%1000)/100]
                +tens[(number%100)/10]
                +units[number%10];
    }

}
