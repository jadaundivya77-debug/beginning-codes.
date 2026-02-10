public class Continue {
    public static void main(String[]args){
        //int i=1;
        for(int i=1, J=2, K=3;i<=10;i++, J=J+2,K=K+5){
            if(i==5){
                continue;
            }
             System.out.println(i+" " + J + " "+ K);

        }
       

    }
    
}
