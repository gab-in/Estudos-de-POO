package exercicioarraylist;
import java.util.List;
import java.util.ArrayList;

public class PercaDeTempo {
    public static void main(String[]args){
        long inicio=System.currentTimeMillis();

        List<Integer> fiveBillionBombs = new ArrayList<Integer>();
        for(int i=0;i<499999;i++){
            fiveBillionBombs.add(i);
        }

        long fim=System.currentTimeMillis();
        long tempo=fim-inicio;
        System.out.println("Tempo Perdido (Legião Urbana): "+tempo+"ms");
    }
}
