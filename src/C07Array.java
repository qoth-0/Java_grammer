import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C07Array {
    public static void main(String[] args) {

////        배열 표현식1 : 리터럴 방식(있는 그대로 값을 세팅)
//        int[] int_arr1 = {1,2,3,4};
////        표현식2 : new 객체
//        int[] int_arr2 = new int[4]; // 기본으로 0 세팅
//        int_arr2[0] = 1;
//        int_arr2[1] = 2;
//        int_arr2[2] = 3;
//        int_arr2[3] = 4;
////        표현식3
//        int[] int_arr3 = new int[]{1,2,3,4};
//
////        표현식 4는 불가 : java의 배열은 반드시 길이가 지정되어야 함
////        int[] int_arr4 = new int[];

////        String배열의 초기값은 null이므로 값을 할당하기 전까지 메소드 실행 불가능
//        String[] arr_st = new String[5];
//        for(int i=0; i<arr_st.length; i++) {
//            if(arr_st[i].isEmpty()) {
//                System.out.println("비어있습니다."); // 에러 - 공백이랑 null은 다름
//            }
//        }

////        85, 65, 90 인 배열선언 후 총합과 평균값 구하기
//        int[] arr = {85, 65, 90};
//        int sum = 0;
//        int avg = 0;
//        for (int i=0;i<arr.length;i++) {
//            sum += arr[i];
//        }
//        avg = sum / arr.length;

////        최대값 구하기
//        int[] arr1 = {10, 20, 30, 12, 8, 17};
//        int max = arr1[0];
//        int min = arr1[0];
//        for (int i=1; i<arr1.length; i++) {
//            if(max<arr1[i]) {
//                max = arr1[i];
//            }
//            if(min>arr1[i]) {
//                min = arr1[i];
//            }
//        }

////        배열의 순서바꾸기
//        int[] arr = {10,20,30,40,50,60,70};
//        int tmp = 0;
//        for(int i=0; i<arr.length-1;i++) {
//            tmp = arr[i];
//            arr[i] = arr[i+1];
//            arr[i+1] = tmp;
//        }
//        System.out.println(Arrays.toString(arr));

////        배열 뒤집기
//        int[] arr = {1,2,3,4,5};
//        int[] result = new int[arr.length];
//        for(int i=0; i<arr.length; i++) {
//            result[arr.length-1-i] = arr[i];
//        }
//        System.out.println(Arrays.toString(result));

////        배열 뒤집기2
//        int[] arr = {1,2,3,4,5};
//        for(int i=0; i<arr.length/2;i++) {
//            int tmp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = tmp;
//        }
//        System.out.println(Arrays.toString(arr));

////        정렬 - sort(), 오름차순이 기본
//        int[] arr = {3,6,1,2,6};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr)); // 1, 2, 3, 6, 6

////        내림차순
////        방법1. Comparator클래스 사용 - 객체타입인 경우에만 사용 가능 (기본형인 int는 불가)
//        String[] str = {"hello", "hi", "bye", "good"};
//        Arrays.sort(str, Comparator.reverseOrder()); // 내림차순 옵션
//        System.out.println(Arrays.toString(str)); // hi, hello, good, bye
//
////        int[] arr1 = {3,5,1,7,4};
////        Arrays.sort(arr1, Comparator.reverseOrder()); // int 불가
//        Integer[] arr2 = {3,5,1,7,4};
//        Arrays.sort(arr2, Comparator.reverseOrder()); // Integer 가능

////        방법2. 오름차순 후 배열뒤집기 (기본형 타입인 경우)
//        int[] arr = {3,6,1,2,6};
//        Arrays.sort(arr);
//        for(int i=0; i<arr.length/2; i++) {
//            int tmp = arr[i];
//            arr[i] = arr[arr.length-1-i];
//            arr[arr.length-1-i] = tmp;
//        }
//        System.out.println(Arrays.toString(arr));

////        방법3. StreamApi, lambda를 활용
//        int[] arr = {5,1,2,7,3,1,2};
//        int[] result = Arrays.stream(arr) // arr을 대상으로 stream 객체생성
//                       .boxed() // int -> Integer로 형변환한 stream 객체생성
//                       .sorted(Comparator.reverseOrder()) // 내림차순 정렬
//                       .mapToInt(a->a) // Integer -> int 변환
//                       .toArray(); // stream 객체를 배열로 변환

////        선택정렬
//        int[] arr = {30, 22, 20, 25, 12};
//        for (int i=0; i<arr.length-1; i++) {
//            for (int j=i+1; j<arr.length; j++) {
//                if(arr[i] > arr[j]) {
//                    int tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

////        숫자 조합의 합 : 각기 다른 숫자의 배열이 있을 때 만들어질 수 있는 2개의 조합의 합을 출력하라(중복x)
//        int[] arr = {10, 20, 30, 40, 50, 60};
//        for (int i=0; i<arr.length-1; i++) {
//            for (int j=i+1; j<arr.length; j++) {
//                System.out.println(arr[i] + " + " + arr[j] + " = " + (arr[i] + arr[j]));
//            }
//        }

////        중복제거하기
//        int[] arr = {10, 10, 40, 5, 7};
//        int[] new_arr = new int[arr.length];
//        int index = 0;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr)); // 5, 7, 10, 10, 40
//        for (int i=0; i<arr.length-1; i++) {
//            if(arr[i] != arr[i+1]) {
//                new_arr[index] = arr[i];
//                index++;
//            }
//        }
//        new_arr[index++] = arr[arr.length-1];
//        System.out.println(Arrays.toString(new_arr)); // 5, 7, 10, 40, 0
//        int[] answer = Arrays.copyOfRange(new_arr, 0, index);
//        System.out.println(Arrays.toString(answer)); // 5, 7, 10, 40

////        프로그래머스 - 두 개 뽑아서 더하기
//        int[] numbers = {5,0,2,7};
//        int index = 0;
//        int[] answer = new int[numbers.length*numbers.length];
//        for(int i=0; i<numbers.length-1; i++) {
//            for(int j=i+1; j<numbers.length; j++) {
//                answer[index] = numbers[i] + numbers[j];
//                index++;
//            }
//        }
//        int[] new_answer = Arrays.copyOfRange(answer, 0, index);
//        Arrays.sort(new_answer);
//        int index1 = 0;
//        int[] result = new int[new_answer.length];
//        for(int i=0; i<new_answer.length-1; i++) {
//            if(new_answer[i] != new_answer[i+1]) {
//                result[index1] = new_answer[i];
//                index1++;
//            }
//        }
//        result[index1++] = new_answer[new_answer.length-1];
//        int[] new_result = Arrays.copyOfRange(result, 0, index1);
//        System.out.println(Arrays.toString(new_result)); // 2, 5, 7, 9, 12

////        버블정렬
//        int[] arr = {5, 2, 4, 3, 1};
//        for(int i = 0; i<arr.length; i++) {
//            for(int j=0; j<arr.length-1-i; j++) {
//                if(arr[j] > arr[j+1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        버블정렬 최적화 - 완료되면 종료
        int[] arr = {5, 1, 2, 3, 4};
        for(int i = 0; i<arr.length-1; i++) { // 마지막 비교는 무의미
            boolean isChanged = false;
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isChanged = true;
                }
            }
            if (isChanged == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));




    }
}
