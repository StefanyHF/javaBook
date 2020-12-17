package exercisesChapter3;

public class Triangle_Page65 {

    double area;
    int height;
    int length;

    public static void main(String[] args) {

        Triangle_Page65[] ta = new Triangle_Page65[4];

        int x = 0;

        while(x < 4){
            ta[x] = new Triangle_Page65();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;

            ta[x].setArea();

            System.out.print("triangle "+x+", area");
            System.out.println(" = " + ta[x] .area);

            x = x + 1;
        }

        int y = x;
        x = 27;
        Triangle_Page65 t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = "+ t5.area);
    }
    void setArea(){
        area = (height * length) / 2;
    }
}
