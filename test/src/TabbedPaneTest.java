// Swing пример использования панели с вкладками JTabbedPane
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class TabbedPaneTest extends JFrame
{
    private  final  Color[]  colors = {Color.cyan, Color.orange, Color.magenta, Color.blue,
            Color.red , Color.green , Color.yellow , Color.pink };
    private  final  String   TEMPL_label   = "Метка %d";
    private  final  String   TEMPL_dynamic = "Динамическая метка %d";
    private  final  String   TEMPL_button  = "Кнопка %d";
    private  final  String   TEMPL_tab     = "Вкладка %d";
    public TabbedPaneTest()
    {
        super("Пример панели с вкладками JTabbedPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // Левая панель с вкладками
        JTabbedPane tabsLeft = new JTabbedPane(JTabbedPane.BOTTOM,
                JTabbedPane.SCROLL_TAB_LAYOUT);
        // Создание вкладок
        for (int i = 1; i < colors.length; i++) {
            JPanel panel = new JPanel();
            // Подкрашиваем панель
            panel.setBackground(colors[i - 1]);
            // Размещение метки во вкладке
            panel.add(new JLabel(String.format(TEMPL_label, i)));
            // Добавление вкладки
            tabsLeft.addTab(String.format(TEMPL_tab, i), panel);
            // Подключение мнемоники
            tabsLeft.setMnemonicAt(i-1, String.valueOf(i).charAt(0));
        }
//        // Подключение слушателя событий
//        tabsLeft.addChangeListener(new ChangeListener() {
//            public void stateChanged(ChangeEvent e) {
//                // Получение выделенной вкладки
//                JPanel panel = (JPanel)((JTabbedPane)e.getSource()).getSelectedComponent();
//                // Количество компонентов в панели
//                int count = panel.getComponentCount();
//                // Добавление на вкладку новой метки
////                panel.add(new JLabel(String.format(TEMPL_dynamic, count)));
//            }
//        });
//        // Подключение слушателя мыши
//        tabsLeft.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent e) {
//                // Определяем индекс выделенной мышкой вкладки
//                int idx = ((JTabbedPane)e.getSource()).indexAtLocation(e.getX(), e.getY());
//                System.out.println("Выбрана вкладка " + idx);
//            }
//        });

        // Правая панель с вкладками
        JTabbedPane tabsRight = new JTabbedPane(JTabbedPane.TOP);
        // Создание вкладок
        for (int i = 1; i < colors.length; i++) {
            // Создание и подкрашивание панели
            JPanel panel = new JPanel();
            panel.setBackground(colors[colors.length - i]);
            // Создание кнопки в панели
            panel.add(new JButton(String.format(TEMPL_button, i)));
            // Добавление панели во вкладку 
            tabsRight.addTab("<html><i>Вкладка №" + i,
                    new ImageIcon("images/copy.png"), panel, "Нажмите " + i);
        }
        // Определение табличного расположения компонентов
        getContentPane().setLayout(new GridLayout());
        // Добавление вкладок в панель содержимого
        getContentPane().add(tabsLeft);
        getContentPane().add(tabsRight);
        // Вывод окна на экран
        setSize(600, 250);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TabbedPaneTest();
    }
}