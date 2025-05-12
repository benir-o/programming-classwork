package codewithmosh;

public class Text_test {
    public static void main(String[] args) {
        var textBox1 =new TextBox();
        var textBox2= textBox1;
        textBox2.setText("Hello World");
        System.out.println(textBox1.text);
        // 2 different variables referencing the same object
        //Garbage collection removes unused objects from the heap

    }
}
