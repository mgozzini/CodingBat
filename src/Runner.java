
public class Runner {

    public static void main(String[] args) {


         System.out.println(SleepIn(true, true));
         System.out.println(stringTimes("Hi", 3));
         System.out.println(helloName("BOB"));
        int[] array = new int[4];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        System.out.println(firstLast6(array));
         System.out.println(cigarParty(30,false));
         System.out.println(makeBricks(3,1,9));
         System.out.println(doubleChar("the"));
         System.out.println(countYZ("fez dazy"));
        int[] array2 = new int[4];
        array2[0]=2;
        array2[1]=1;
        array2[2]=2;
        array2[3]=3;
        array2[4]=4;
         System.out.println(countEvens(array2));
        int[] array3 = new int[4];
        array3[0]=1;
        array3[1]=3;
        array3[2]=4;
        System.out.println(scoresIncreasing(array3));
    }



        public static boolean SleepIn(boolean weekday, boolean vacation) {
        if (weekday==false || vacation == true){
           return true;
        }
        return false;
        }




    public static String stringTimes(String str, int n) {
        String fine = "";
       for(int i=0;i<n;i++){
           fine= fine + str;
       }
       return fine;
    }



    public static String helloName(String name){
    return "Hello " + name + "!";
    }


    public static boolean firstLast6(int[] numbers) {
        return (numbers[0] == 6 || numbers[numbers.length - 1] == 6);
    }


    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars>40 || isWeekend == true){
            return true;
        }
        return false;
    }


    public static boolean makeBricks(int small, int big, int goal) {
                if ((big*5)+small==goal){
           return true;
        }
        return false;
    }


    public static String doubleChar(String str) {
        String word="";
        for(int i=0;i<str.length() ;i++){
            char put = str.charAt(i);
            word += "" + put+ put;

        }
        return word;
    }



    public static int countYZ(String str) {
        str = str.toLowerCase() + " ";
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' && !Character.isLetter(str.charAt(i + 1))) {
                num++;
            }
           if (str.charAt(i) == 'y' && !Character.isLetter(str.charAt(i + 1))) {
                num++;
            }
            if (str.charAt(str.length() - 1) == 'z' || str.charAt(str.length() - 1) == 'y') {
                num++;
            }
        }
        return num;
    }


    public static int countEvens(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                count ++;
            }
        }
        return count;
    }


    public static boolean scoresIncreasing(int[] nums){
for(int i = 0; i<= nums.length -2; i++)
    if(nums[i]>nums[i+1]){
    return false;
    }
        return true;
    }
    
}

