public class Rectangle {


    //public static void area() {
      //  float height = 5;
    //    float width = 10;
      //  float area = width * height;
        //System.out.println("Area = " + area);

   // }
    //public static void area(float height, float width) {
    //    float area = height * width;
    //    System.out.println("Area = " + area);
    //}
    public static float area(float height, float width) {
        float area = height * width;
        return area;
    }



    public static void main (String []args) {
        float h = 5;
        float w = 10;
        
        //area();
        //area(h, w);
        float a = area(h, w);
        System.out.println("Area = " + a);
    }
}