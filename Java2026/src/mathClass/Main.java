package mathClass;
/*Math Class*/
public class Main {

    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result = Math.pow(2, 3);
        System.out.println(result);

        double sqrtResult = Math.sqrt(16);
        System.out.println(sqrtResult);

        double absResult = Math.abs(-5);
        System.out.println(absResult);

        double roundResult = Math.round(3.7);
        System.out.println(roundResult);

        double ceilResult = Math.ceil(3.2);
        System.out.println(ceilResult);

        double floorResult = Math.floor(3.8);
        System.out.println(floorResult);

        double logResult = Math.log(10);
        System.out.println(logResult);

        double expResult = Math.exp(2);
        System.out.println(expResult);

        double sinResult = Math.sin(Math.PI / 2);
        System.out.println(sinResult);

        double cosResult = Math.cos(Math.PI);
        System.out.println(cosResult);

        double tanResult = Math.tan(Math.PI / 4);
        System.out.println(tanResult);

        double atanResult = Math.atan(1);
        System.out.println(atanResult);

        double sinhResult = Math.sinh(1);
        System.out.println(sinhResult);

        double coshResult = Math.cosh(1);
        System.out.println(coshResult);

        double tanhResult = Math.tanh(1);
        System.out.println(tanhResult);

        double randomResult = Math.random();
        System.out.println(randomResult);

        double randomInRange = Math.random() * 10;
        System.out.println(randomInRange);

        double randomMax = Math.max(10, 34);
        System.out.println(randomMax);

        double randomMin = Math.min(10, 34);
        System.out.println(randomMin);

    }
}
