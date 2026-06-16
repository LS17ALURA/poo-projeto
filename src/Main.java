import javax.swing.*;
import java.awt.*;

public static void main(String[] args) {
    JFrame janela = new JFrame("Ecossistema");
    janela.setSize(800, 680);
    janela.setLocationRelativeTo(null);
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setLayout(new BorderLayout());

    JPanel painel = new JPanel();
    painel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

    JButton botao = new JButton("Avançar");
    painel.add(botao);

    janela.add(painel, BorderLayout.NORTH);
    janela.add(new Graficos(), BorderLayout.CENTER);

    janela.setVisible(true);
}
