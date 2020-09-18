public class Lab1_5 {
    int result;

    void Calculate(int number){
        int result = 1;
        for (int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.println(result);
    }
}

class Lab1_5_Tester{
    public static void main(String[] args) {
        Lab1_5 lab = new Lab1_5();
        lab.Calculate(10);
    }
}
