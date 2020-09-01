package day_004;

public class ArrayDemo_5 {
    public static void main(String[] args){
        int[] arr={5,1,23,4,5,6,7,8,2};
        int max =arr[0];
        int mix = arr[0];
        System.out.println(max+" "+mix);

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }else if(mix>arr[i]){
                mix=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(mix);
    }
}
