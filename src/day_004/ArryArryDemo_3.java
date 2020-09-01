package day_004;
/*          二维数组的遍历求和
*          第一组{11,12}万元
*          第二组{21,22,23}万元
*          第三组{31,32,33,34}万元
*
*         求和
*
* */

public class ArryArryDemo_3 {
    public static void main(String[] args){
        int[][] arr={{11,12},{21,22,23},{31,32,33,34}};

        int sum=0;
        int groupSum=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                groupSum+=arr[i][j];
            }
            System.out.println("每个小组总金额"+groupSum);
            //将每个一维数组相加
            sum +=groupSum;

        }
        System.out.println("总金额为"+sum);
    }
}
