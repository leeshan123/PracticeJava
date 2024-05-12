package test;

import java.util.Random;

public class WrapperTest5 {
    public static void main(String[] args) {

        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();

        System.out.println("로또 번호: ");
        for (int lottoNumber : lottoNumbers){
            System.out.println(lottoNumber);
        }



    }

    public static class LottoGenerator{
        private Random random = new Random();
        private int[] lottoNumbers;
        private int count =0;

        public int[] generate(){
            lottoNumbers = new int[6];
            count =0;

            while (count < 6){
                //1부터 45 사이의 숫자 생성
                int number = random.nextInt(45)+1;
                //중복이 되지 않는 경우에만 배열에 추가
                if (isUnique(number))
                lottoNumbers[count] = number;
                count++;
            }
            return lottoNumbers;
        }

        //이미 생성된 번호와 중복된지 검사
        private  boolean isUnique(int number){
            for(int i =0; i<count; i++){
                if(lottoNumbers[i] == number){
                    return false;
                }
            }
            return true;
        }


    }

}
