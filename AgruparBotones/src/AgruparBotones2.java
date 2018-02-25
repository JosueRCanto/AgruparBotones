//Agregar botones al programa de ButtonGroup
//Ing Sistemas computacionales 4 Semestre Grupo A
//Ramírez Canto Josué Emmanuel
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class AgruparBotones2 extends JFrame
        implements ActionListener {

    public AgruparBotones2(String titulo) {
        //Creacion de los RadioButtons
        JRadioButton birdButton = new JRadioButton("Pajarito");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setActionCommand("bird");
        birdButton.setSelected(true);

        JRadioButton catButton = new JRadioButton("Gatito");
        catButton.setMnemonic(KeyEvent.VK_C);
        catButton.setActionCommand("cat");

        JRadioButton dogButton = new JRadioButton("Perrito");
        dogButton.setMnemonic(KeyEvent.VK_D);
        dogButton.setActionCommand("dog");

        JRadioButton rabbitButton = new JRadioButton("Conejito");
        rabbitButton.setMnemonic(KeyEvent.VK_R);
        rabbitButton.setActionCommand("rabbit");

        JRadioButton pigButton = new JRadioButton("Cerdito");
        pigButton.setMnemonic(KeyEvent.VK_P);
        pigButton.setActionCommand("pig");

        ButtonGroup btgAnimalitos = new ButtonGroup(); //agruparlos

        btgAnimalitos.add(birdButton);
        btgAnimalitos.add(catButton);
        btgAnimalitos.add(dogButton);
        btgAnimalitos.add(rabbitButton);
        btgAnimalitos.add(pigButton);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(0,1));
        //radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);
        //radioPanel.setBackground(Color.GREEN);

        JLabel picture = new JLabel(new ImageIcon("images/loro.png"));
        JPanel PanelTotal1 = new JPanel();
        PanelTotal1.setLayout(new GridLayout(1,2));
        PanelTotal1.add(radioPanel);
        PanelTotal1.add(picture);
        //PanelTotal1.setBackground(Color.YELLOW);

        JButton Button1 = new JButton ("Button1");
        JButton Button2 = new JButton ("Button2");
        JPanel PanelTotal2 = new JPanel();

        //PanelTotal2.setLayout(new GridLayout(1,2));
        PanelTotal2.setLayout(null);

        Button1.setBounds(15, 30, 100, 30);
        Button2.setBounds(145, 30, 100, 30);

        PanelTotal2.add(Button1);
        PanelTotal2.add(Button2);
        //PanelTotal2.setBackground(Color.red);

        /*BoxLayout distBoxLayout = new BoxLayout(this.getContentPane(),
                                                BoxLayout.X_AXIS);
        getContentPane().setLayout(distBoxLayout);
        */

        GridLayout distGrid = new GridLayout(2,1);
        getContentPane().setLayout(distGrid);
        getContentPane().add(PanelTotal1);
        getContentPane().add(PanelTotal2);

        /*
        getContentPane().add(radioPanel, BorderLayout.WEST);
        getContentPane().add(picture,BorderLayout.CENTER);
        */

        //getContentPane().setBackground(Color.BLUE);

        pack();

        setTitle(titulo);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento producido por " + e.getActionCommand());
    }

    public static void main (String[] args) {
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };

        JFrame frame = new AgruparBotones2("Curso de Java: Agrupar Botones");
        frame.addWindowListener(l);

        frame.pack();
        frame.setVisible(true);
    }
}
