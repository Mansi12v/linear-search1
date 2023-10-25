import java.util.*;
public class Basics1{
    public static int linearsearch(int number[], int key){
        for(int i =0; i<number.length;i++){
            if(number[i] == key){
                retuen i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,14,16};
        int key =10;
        int index= linearseach(number, key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("key is at index:" + index);
        }
    }
}