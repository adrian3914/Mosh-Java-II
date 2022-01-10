package ca.adrian;

public class TextBox extends UIControl{
    // fields
    private String text = "";

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    @Override // annotation that gives the java compiler extra information
    public String toString() {
        return text;
    }

    // methods
     public void setText(String text){
        this.text = text; // this -> this object
    }

    public void clear(){
        text = "";
    }

}
