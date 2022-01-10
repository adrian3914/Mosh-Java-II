package ca.adrian;

public class TextBox extends UIControl{
    // fields
    private String text = "";

    // methods
     public void setText(String text){
        this.text = text; // this -> this object
    }

    public void clear(){
        text = "";
    }
}
