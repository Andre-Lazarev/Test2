public class Solution {

    public static void main(String[] args) {
        Solution dayOfWeek = new Solution();
        dayOfWeek.checkDay(1);
        System.out.println("test");
        System.out.println("test");

    }

    public void checkDay(int number) {
        switch (number) {
            case 1:
                System.out.println("number = 1 ->  Monday");
                break;
            case 2:
                System.out.println("number = 2 -> Tuesday");
                break;
            case 3:
                System.out.println("number = 3 -> Wednesday");
                break;
            case 4:
                System.out.println("number = 4 -> Thursday");
                break;
            case 5:
                System.out.println("number = 5 -> Friday");
                break;
            case 6:
                System.out.println("number = 6 -> Saturday");
                break;
            case 7:
                System.out.println("number = 7 -> Sunday");
                break;
            default:
        }
    }
}
