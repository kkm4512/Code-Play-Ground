package 프로그래머스;

public class Test4 {
    public static void main(String[] args) {
        int storage = 5141;
        int usage = 500;
        int[] change = new int[]{10, -10, 10, -10, 10, -10, 10, -10, 10, -10};
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            usage += change[i] >= 0 ? usage/change[i] : -(usage/Math.abs(change[i]));
//            usage += change[i] >= 0 ? usage / 10 : -(usage / 10);
            System.out.println(i+1 + "번째 :" + usage);
            total_usage += usage;
            if(total_usage > storage){
                System.out.println(i);
            }
        }
        System.out.println(-1);
    }
}
