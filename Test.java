public class Test {
   public static void main(String[] args) {

      Circle circle;
      Square square;

      circle = new Circle( 22, 8, 12 );
      square = new Square( 22, 8, 24);

      System.out.print(circle.getName() +
                            ": " + circle.toString());
      System.out.println("; Area = " + circle.getArea());

      System.out.print(square.getName() +
                            ": " + square.toString());
      System.out.println("; Area = " + square.getArea());
   }
}

