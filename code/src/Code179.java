import java.util.Arrays;
import java.util.stream.Collectors;

public class Code179 {

  public static void main(String[] args) {
    int[] arr = {3,30,34,5,9};
    System.out.println(largestNumber(arr));
  }
  
  public static String largestNumber(int[] nums) {
    
    String[] s = new String[nums.length];
    for (int i = 0; i < nums.length; i++) {
      s[i] = String.valueOf(nums[i]);
    }
    
    Arrays.sort(s, (x,y)->(y+x).compareTo(x+y));

    String res = Arrays.stream(s).collect(Collectors.joining(""));
    
    //注意：需要考虑到[0,0]的特殊情况
    return res.charAt(0)=='0'?"0":res; 
    
  }
  
}
