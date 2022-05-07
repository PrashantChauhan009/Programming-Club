public class CountCh {
    public static void main(String[] args) {

        int cn=0,cs=0,cc=0,cw=1;
        String s=new String(" SUBSCRIBE NOW CP Edits: 1 MILLION SUBSCRIBER WILL COMPLETE");
        s=s.trim();
        String s1=new String("0123456789");


        for (int i = 0; i < s.length(); i++) {
           for (int j = 0; j < s1.length() ; j++) {
               if((s.charAt(i))==(s1.charAt(j))){
                   cn++;
               }
           }
           
           if(s.charAt(i)==' '){
               cs++;
               cc=s.length()-cs-cn;

               if(s.charAt(i+1)!=' '){
                   cw++;
               }
           }
          
        }

        System.out.println(" count number:"+cn+" count space: "+cs+" count char: "+cc+" count word: "+cw);
    }
}
