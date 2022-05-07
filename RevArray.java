public class RevArray {
    
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int temp=0;
    
        for (int i = 0; i < a.length/2; i++) {
            temp=a[i];
            a[i]=a[4-i];
            a[4-i]=temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
   
}
