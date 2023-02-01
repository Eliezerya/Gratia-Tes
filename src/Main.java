import java.lang.module.FindException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------- SOAL 1");
        soal1();
        System.out.println("------- SOAL 2");
        soal2(scanner);
        System.out.println("------- SOAL 3");
        soal3(scanner);

    }

    public static void soal1(){
        for (int baris =1;baris<= 5;baris++){
            if (baris%2 != 0){
                for(int i = 1; i <=5; i++){
                    if (i%2 == 0){
                        System.out.print("O");
                    }else {
                        System.out.print("X");
                    }
                }
            }else{
                for(int i = 1; i <=5; i++){
                    if (i%2 == 0){
                        System.out.print("X");
                    }else {
                        System.out.print("O");
                    }
                }
            }
            System.out.println("");
        }
    }


    public static void soal2(Scanner scanner){
        System.out.println("masukan input :");
        String word = scanner.nextLine();

        List<String> listWord = new ArrayList<>(Arrays.asList(word.split("")));

        Set<String> dataSet = new HashSet<String>(listWord);
        Map<String, Integer> dataMap =  new HashMap<>();

        int count = 0;
        for(String set : dataSet)
        {
            for(String arr : listWord)
            {
                if(set.equals(arr)) {
                    count += 1;
                }
            }
            dataMap.put(String.valueOf(set), count);

            count = 0;
        }

        for (Map.Entry<String, Integer> data : dataMap.entrySet()) {
            System.out.println(data.getKey()+":"+data.getValue());

        }
    }

    public static void soal3(Scanner scanner){
        int[] nums = {2,7,11,15};
        int targNum;
        System.out.println(Arrays.toString(nums));
        System.out.print("Target :");
        targNum = scanner.nextInt();
        twoSum(nums, targNum);
    }

    public static void twoSum(int[] nums, int target) {
        Set<Integer> unique = new HashSet<>();

        for (int a : nums) {
            int b = target - a;
            if (unique.contains(b)) {
                int index1=0;
                int index2=0;
                for (int i=0;i < nums.length;i++){
                    if (nums[i] == a){
                        index1 = i;
                    }
                }
                for (int i=0;i < nums.length;i++){
                    if (nums[i] == b){
                        index2 = i;
                    }
                }

                System.out.println(a + " " + b);
                System.out.println("["+index2 + "," + index1+"]");

                return;
            }

            unique.add(a);
        }

        System.err.println("not found");
    }
}