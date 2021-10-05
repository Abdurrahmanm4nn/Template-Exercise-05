class Test {
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
    }
}
