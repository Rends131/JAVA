package day_004;

public class ArryArryDemo_2 {
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5},{6,7,8,9},{0},{11}};

        //遍历二维数组
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
