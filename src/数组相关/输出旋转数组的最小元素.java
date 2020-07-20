package 数组相关;

/**
 * @Author Meng Xin
 * @Date 2020/7/20 16:20
 */
public class 输出旋转数组的最小元素 {
    //把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
    //输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
    //例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
    //NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
    public int minNumberInRotateArray(int[] array) {
//        if (array == null || array.length == 0) {
//            return 0;
//        }
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] > array[i + 1]) {
//                return array[i + 1];
//            }
//        }
//        return array[0];

        if (array == null || array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (array[left] >= array[right]) {
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = left + ((right - left) >> 1);
            if (array[left] == array[right] && array[mid] == array[left]) { //1
                int result = array[left];
                for (int i = left + 1; i < right; i++) {
                    if (array[i] < result) {
                        result = array[i];
                    }
                }
                return result;
            }
            mid = left + ((right - left) >> 1);
            if (array[left] == array[right] && array[mid] == array[left]) { //1
                int result = array[left];
                for (int i = left + 1; i < right; i++) {
                    if (array[i] < result) {
                        result = array[i];
                    }
                }
                return result;
            }
            if (array[mid] >= array[left]) {
//说明mid在原数组的前半部分
//如果array[mid] == array[left]， 上面1处的条件不满足且array[left]
//>= array[right]，则，array[mid] > array[right]
                left = mid;
            } else {
                right = mid;
            }
        }
        return array[mid];
    }
}
