package GUI_Study;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExerciseDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setLocation(300,400);
        frame.setBackground(Color.BLACK);

        frame.setLayout(new GridLayout(2,1));
        //4个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2,1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2,1));

        //上面
        p1.add(new Button("East1"),BorderLayout.EAST);
        p1.add(new Button("West1"),BorderLayout.WEST);
        p2.add(new Button("p2-btn-1"));
        p2.add(new Button("p2-btn-2"));
        p1.add(p2,BorderLayout.CENTER);

        //下面
        p3.add(new Button("East2"),BorderLayout.EAST);
        p3.add(new Button("West2"),BorderLayout.WEST);
        //中间4个
        for (int i = 1; i <= 4; i++){
            p4.add(new Button("p4-btn-" + i));
        }
        p3.add(p4,BorderLayout.CENTER);

        frame.add(p1);
        frame.add(p3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });





    }
}
