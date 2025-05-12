package codewithmosh;

public class TextBox {
    public String text;//Field
    public void setText (String text){
        this.text=text;
        //this is a reference to the current object
        //Every class in java inherits from Obj
    }
    public void clear(){
        text="";
    }


}
