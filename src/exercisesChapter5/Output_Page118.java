package exercisesChapter5;

public class Output_Page118 {

    public static void main(String[] args) {
        Output_Page118 o = new Output_Page118();
        o.go();
    }

    void go(){
        int y = 7;
        for(int x = 1; x < 8; x++){
            y++;
            if(x > 4) {
                System.out.println(++y + " ");
            }
            if(y > 14){
                System.out.println("x = " + x);
                break;
            }
        }
    }
}
