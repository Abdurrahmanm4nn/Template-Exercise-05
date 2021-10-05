public class Test {
    public static void printMovablePoint(MovablePoint point){
        System.out.println(point);
    }
    
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(0, 0);
        point1.moveUp();
        point1.moveUp();
        point1.moveDown();
        point1.moveRight();
        point1.moveRight();
        point1.moveRight();
        point1.moveLeft();
        System.out.println(point1); // output : '2, 1'

        Movable point2 = new MovablePoint(3, 2);
        //ganti kode di bawah ini aja jangan yang di atas-atasnya!
        printMovablePoint(point2); // output : '3, 2'
    }
}