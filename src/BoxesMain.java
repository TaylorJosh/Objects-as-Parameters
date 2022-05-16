
public class BoxesMain {
    public static void main(String[] args) throws Exception {
        
        Boxes box1 = new Boxes(10, 20);
        Boxes box2 = new Boxes(20, 30);
        Boxes box3 = new Boxes(box1);
        Boxes box4 = box2.duplicate();

        box3.display();
        box1.display();
        box4.display();
        box2.display();

        if(box1.equals(box2)){
            System.out.println("Boxes are equal");

        }else{System.out.println("Boxes are not equal");}


        if(box1.isTwoObjectsEqual(box1, box3)){
            System.out.println("Boxes are equal");

        }else{System.out.println("Boxes are not equal");}

    }
}
