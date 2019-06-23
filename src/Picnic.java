import java.util.Scanner;

public class Picnic {

    static boolean[][] areFriend = new boolean[10][10];

    //TODO : 재귀함수 구현
    int countPair(boolean[] taken) {
        return 1;
    }


    public static void main(String[] args) {

        //입력 받기
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();
        int peopleNum =0;
        int friendNum = 0;
        String tempLine ="";
        String fndInfoLine ="";
        for(int i=0; i<testCase; i++){
            tempLine = sc.nextLine();
            peopleNum = Integer.parseInt(tempLine.substring(0,1));
            friendNum = Integer.parseInt(tempLine.substring(2,3));

            fndInfoLine =sc.nextLine();
            //TODO : 다음으로 짝 2명씩 받아와서 areFriend 2차원배열 초기화 하기

        }

        boolean[] taken = new boolean[peopleNum];
        //초기화
        for(int i=0; i<peopleNum; i++){
            taken[i] = false;
        }



    }
}
