public class asdf {
    public static void main(String[] args) {
        int sumDay = 0;
        int x = 3;
        if(x % 2 == 1 ){
            if(x > 2){
                sumDay += 30 * (x / 2 -1) + 31 * (x / 2 + 1) + 28; 
            }
            else{
                sumDay = 31;
            }
        }
        else if(x % 2 == 0 ){
            if (x == 2){
                sumDay += 59;
            }
            else{
                sumDay += 30 * (x / 2 -1) + 31 * (x / 2) + 28;
            }
        }

        System.out.println(sumDay);
    } 
}
