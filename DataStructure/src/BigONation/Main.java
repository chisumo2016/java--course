package BigONation;
/*
  Big 0 Notation :
      How code slows as data grows .

      Describe the performance of an algorithm as the amount of data increases.
      Machine independent (# of steps to completion)
      Ignore smaller operations 0(n+1) -> 0(n)

        example
        0(1) - Constant Time
        0(n) - Linear Time
        0(n^2) - Quadratic Time
        0(log n) - Logarithmic Time
        0(2^n) - Exponential Time
        0(n!) - Factorial Time

        n = amount of data + (it's a variable like x)

    0(n) - Linear Time  n=1000000 ~1000000 steps
        int addUp(int n){
          int sum = 0;
          for(int i=0; i<=n; i++){
            sum += i;
          }
            return sum;
        }

        0(1) - Constant Time  n=1000000 3 steps
        int addUp(int n){
          int sum = n* (n+1)/2;

            return sum;
        }
  */
public class Main {

    public static void main(String[] args) {


    }
}
