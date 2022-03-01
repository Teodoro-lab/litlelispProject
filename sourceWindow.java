import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sourceWindow extends JFrame {
    public sourceWindow() {
        setSize(450, 216);//Establecemos el tamaño de la ventana
        setTitle("PRUEBA DE EXPRESIÓN");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);//Codigo base de la ventana sin panel

        iniciarVentana();//Llama a la funcion para comenzar el panell y componentes
    }

    public void iniciarVentana() {
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 450, 180);
        panel.setBackground( new Color(177, 186, 197));
        panel.setLayout(null);
        this.getContentPane().add(panel);

        JLabel expresion = new JLabel("Expresión:");
        expresion.setFont(new Font("Cousine", 1, 18));
        expresion.setForeground(Color.black);
        expresion.setHorizontalAlignment(SwingConstants.CENTER);
        expresion.setBounds(30,50,110, 30);
        panel.add(expresion);

        JTextField exp = new JTextField();
        exp.setFont(new Font("Cousine", 3, 20));
        exp.setHorizontalAlignment(SwingConstants.CENTER);
        exp.setBounds(155,50,250,30);
        exp.setBackground(new Color(177, 186, 230));
        panel.add(exp);

        JButton genTree = new JButton("Generar Árbol");
        genTree.setBackground(new Color(120, 169, 223));
        genTree.setBounds(15, 120, 200, 40);
        genTree.setForeground(Color.black);
        genTree.setFont(new Font("Cousine", 1, 15));
        panel.add(genTree);

        JButton genRes = new JButton("Generar Resultado");
        genRes.setBackground(new Color(120, 169, 223));
        genRes.setBounds(235, 120, 200, 40);
        genRes.setForeground(Color.black);
        genRes.setFont(new Font("Cousine", 1, 15));
        panel.add(genRes);

        ActionListener genT = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputExpr = exp.getText();
                CharStream charS = CharStreams.fromString(inputExpr);
                ExprLexer lexer = new ExprLexer(charS);
                CommonTokenStream tokenS = new CommonTokenStream(lexer);
                ExprParser parser = new ExprParser(tokenS);
                ParseTree tree = parser.expr();

                newVisitor visitor = new newVisitor();
                visitor.visit(tree);

                JOptionPane.showMessageDialog(null, tree.toStringTree(parser), "Tree", JOptionPane.INFORMATION_MESSAGE);
                exp.setText("");


            }
        };
        genTree.addActionListener(genT);

        ActionListener genResult = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, PrefixEvaluator.evaluate(exp.getText()), "Result", JOptionPane.INFORMATION_MESSAGE);
                exp.setText("");

            }
        };
        genRes.addActionListener(genResult);

    }

    public static void main(String[] args) {
        sourceWindow nuevaVentana = new sourceWindow();
        nuevaVentana.setVisible(true);
    }
}