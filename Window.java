import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JLabel;

public class Window extends JFrame {
    JTextField f;
    JComboBox box;
   JComboBox Sours;
   String[] kind={"Из файла","С консоли"};
   String [] type= {"Букофки ","Чиселки","Другое"};
    public Window(){
        super("Ну допустим, интерфейс");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        box= new JComboBox(type);
        Sours=new JComboBox(kind);
        box.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED){
                    if(box.getSelectedIndex()==0){

                    }
                }
            }
        });
        add(Sours);
        add(box);
        add(new JLabel("Введите размерность массива"));

        f = new JTextField(14);
        f.setText("Здесь должно быть число");
        this.add(f);
        this.setVisible(true);

        f.addFocusListener(new FocusListener() {

                               @Override
                               public void focusGained(FocusEvent e) {
                                   f.setText(null);
                               }

                               @Override
                               public void focusLost(FocusEvent e) {
                                   f.setText("Число!");
                               }
                           });
                panel.add(new JButton("Воть"));
                setBounds(200, 200, 300, 200);
            }
            /*
            public static void main(String[] args) {
                Window app = new Window();
                app.setVisible(true);
            }*/
        }