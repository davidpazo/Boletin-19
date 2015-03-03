package Boletin19;
/**** @author dpazolopez ****/
public class Boletin19 {

    public static void main(String[] args) {
        Buzon obx= new Buzon();
        int op;
        do{
            op= obx.menu();
            switch(op){
                case 1: obx.add();
                    break;
                case 2:obx.numCorreos();
                    break;
                case 3:obx.porLeer();
                    break;
                case 4: obx.delete();
                    break;
                case 5: obx.ordear();
                        break;
                case 6: System.exit(0);
            }
        }while(op!=6);
        }
    }
    