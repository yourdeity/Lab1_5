import java.util.Random;



public class lab1_4 {

    int[] arr0 = new int[8];



    void GenRandomNumbers0(){

        for(int i = 0; i < arr0.length; i++){

            arr0[i] = (int)(Math.random() * 100);

        }

    }



    void GenRandomNumbers1(){

        Random rand = new Random();

        for(int i = 0; i < arr0.length; i++){

            arr0[i] = rand.nextInt(1000);

        }

    }



    void ShowArray(){

        for(int i = 0; i < arr0.length; i++){

            System.out.print(arr0[i] + " ");

        }

        System.out.println();

    }



    void SortBubble(){

        for(int j = 0; j < arr0.length - 1; j++){

            for (int i = 0; i < arr0.length - 1; i++){

                if(arr0[i] > arr0[i + 1]){

                    int temp = arr0[i];

                    arr0[i] = arr0[i + 1];

                    arr0[i + 1] = temp;

                }

            }

        }

    }

}



class Lab1_4_Tester{

    public static void main(String[] args) {

        lab1_4 lab = new lab1_4();

        lab.ShowArray();

        lab.GenRandomNumbers0();

        lab.ShowArray();

        lab.SortBubble();

        lab.ShowArray();

        //Второй способ генерации чисел

        lab.GenRandomNumbers1();

        lab.ShowArray();

        lab.SortBubble();

        lab.ShowArray();

    }

}
