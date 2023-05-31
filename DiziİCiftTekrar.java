import java.util.Arrays;

public class DiziİCiftTekrar {

public static boolean isFind(int[] arr,int value){
    for (int i : arr) {
        if(i==value){
            return true;
        }
    }
    return false;
}
public static void main(String[] args) {
    int k=0;
    int[] list={3,7,3,16,3,2,9,10,21,33,16,9,10};
    //System.out.println("list dizisinin lenght :"+list.length);
    int [] temp=new int[list.length];
    for(int i=0; i<list.length;i++){
        for(int j=0;j<list.length;j++){
            //System.out.println(list[i]);
            if(i!=j&&list[i]==list[j]&&list[i]%2==0){
                if(!isFind(temp, list[i])){
                    temp[k++]=list[i];
                    
                }
                break;
                
            }
            
            
        }
        
    }
    System.out.print(Arrays.toString(temp));
}
}