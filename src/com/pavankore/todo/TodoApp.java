package com.pavankore.todo;

import javax.swing.*;
import java.awt.*;

public class TodoApp extends JFrame {
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> list = new JList<>(listModel);
    private JTextField input = new JTextField(18);
    private JButton addBtn = new JButton("Add");
    private JButton deleteBtn = new JButton("Delete");

    public TodoApp() {
        super("To-Do App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 320);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(8,8));

        JPanel top = new JPanel();
        top.add(input);
        top.add(addBtn);
        add(top, BorderLayout.NORTH);

        add(new JScrollPane(list), BorderLayout.CENTER);

        JPanel bottom = new JPanel();
        bottom.add(deleteBtn);
        add(bottom, BorderLayout.SOUTH);

        addBtn.addActionListener(e -> {
            String t = input.getText().trim();
            if (!t.isEmpty()) {
                listModel.addElement(t);
                input.setText("");
            }
        });

        deleteBtn.addActionListener(e -> {
            int i = list.getSelectedIndex();
            if (i != -1) listModel.remove(i);
        });

        input.addActionListener(e -> addBtn.doClick());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TodoApp().setVisible(true));
    }
}
