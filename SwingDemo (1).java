package java_prog.pr4;

import javax.swing.*;

class SwingDemo {

    SwingDemo() {

        // Создать новый контейнер (окна) JFrame
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Установка начального размера фрейма
        jfrm.setSize(275, 100);

        // Заершить работу прогрммы, когда пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать текстовую метку средствами Swing
        JLabel jlab = new JLabel(" Swing defines the modern Java GUI.");

        // Добавить метку в панель содержимого
        jfrm.add(jlab);

        // Отобразить фрейм
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        // Создать фрейм в потоке диспетчера событий (создает объект SwingDemo)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
