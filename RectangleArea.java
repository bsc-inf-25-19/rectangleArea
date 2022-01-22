import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length sir : ");
        int length = input.nextInt();
        System.out.print("Enter breadth sir : ");
        int breadth = input.nextInt();

        Area rectOne = new Area(length,breadth);
        System.out.println("Area of the rectangle is " + rectOne.returnArea());

    }
    static class Area{
        int length;
        int breadth;

        public Area(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }
        public int returnArea(){
            int area =length*breadth;
            return area;
        }
    }
}

