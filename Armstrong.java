public class Armstrong{
    public static void main(String[] args){
        int num = 153;
        int original = num;
        int count = 0;
        int temp = num;
    while(num!=0){
        count++;
        num = num/10;
    }
    int result = 0;
    while(temp!=0){
        
        int digit = temp%10;
        int power = 1;
        for(int i = 1; i <=count; i++){
            power *= digit;
    }
        result += power;
        temp = temp/10;
    }
    
    if (original == result) {
        System.out.println("AN");
    }else{
        System.out.println("NAN");
    }
    }
}