public class Boxes {
    private int width;
    private int height;

  


    public Boxes(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Boxes(Boxes b) {
        this.width = b.width;
        this.height = b.height;
    }


     static boolean isTwoObjectsEqual(Boxes b1, Boxes b2){
         if(b1.width == b2.width && b1.height == b2.height){
             return true;
         }else{
             return false;
         }


    }


    Boxes duplicate(){
        Boxes temp = new Boxes(this.width, this.height);
        return temp;
    }



    public boolean isEqual(Boxes b){
        if(this.width == b.width && this.height == b.height)
            {return true;}
        else 
            {return false;}
    }


    public void display(){
        System.out.println("Width: " + this.width + "\nHeight: " + this.height);
    }

}
