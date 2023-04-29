import java.awt.*;
public class login extends Frame {
    login() {
        GridLayout g = new GridLayout(3,3);
        setLayout(g);
        Label l1 = new Label("Username");
        TextField t1 = new TextField(1);
        Label l2 = new Label("Password");
        TextField t2 = new TextField(1);
        Button b1 = new Button("Submit");
        Button b2 = new Button("login");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);

    }

    public static void main(String[] args) {
        Frame f=new login();


        f.setSize(300,300);
        f.setVisible(true);
    }
}