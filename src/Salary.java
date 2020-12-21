public class Salary {
    public static void main(String[] args) {
        int podwyzka = 0, salary = 2500;

        switch(salary){
            case 100: {podwyzka = 1000; double procentowyWzrost = (podwyzka*100/salary);
            System.out.println( "Twoja pensja wzrosła do:" + (salary+podwyzka));
                System.out.println("Twoja pensja wzrosła o:"+ procentowyWzrost + " procent");
                }
                break;
            case 2000: {podwyzka = 200; double procentowyWzrost = podwyzka*100/salary;
                System.out.println( "Twoja pensja wzrosła do:" + (salary+podwyzka));
                System.out.println("Twoja pensja wzrosła o:"+ procentowyWzrost + " procent");
                }
            break;
            case 2500: {podwyzka = 25; double procentowyWzrost = podwyzka*100/salary;
                System.out.println( "Twoja pensja wzrosła do:" + (salary+podwyzka));
                System.out.println("Twoja pensja wzrosła o:"+ procentowyWzrost + " procent");
                }
            break;}

           // System.out.println("Twoja pensja wzrosła o:"+ procentowyWzrost + " procent");




    }
}
