package 数组相关;

/**
 * @Author Meng Xin
 * @Date 2020/7/20 16:01
 */
public class 二位数组递增 {
    //在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
// 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
// 判断数组中是否含有该整数。
    public boolean Find(int target, int[][] array) {
        if (array == null) {
            return false;
        }
        int i = 0;
        int j = array[0].length - 1;
        while (i < array.length && j >= 0) {
            if (target < array[i][j]) {
                //array[i][j]一定是当前行最大的，当前列最小的
                //target < array[i][j]，比当前列最小的还小，则当前列之后的不存在该值，排除当前列
                j--;
            } else if (target > array[i][j]) {
                //target > array[i][j]，比当前行最大的还大，则该行不存在该值，排除当前行
                i++;
            } else {
                //找到
                return true;
            }
        }
        return false;
    }
}
