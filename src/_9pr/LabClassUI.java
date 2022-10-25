package _9pr;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.ArrayList;

public class LabClassUI extends JFrame {
    private ArrayList<Student> students;
    private JTable studTable;

    LabClassUI(ArrayList<Student> students) {
        super("StudentUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);

        this.students = students;


        JPanel jpanel = new JPanel(new FlowLayout());
        JButton addStudentButton = new JButton("Добавить студента");
        JButton deleteStudentButton = new JButton("Удалить студента");
        JButton searchStudentButton = new JButton("Найти студента");
        JButton sortStudentButton = new JButton("Сортировать");


        jpanel.add(addStudentButton);
        jpanel.add(deleteStudentButton);
        jpanel.add(searchStudentButton);
        jpanel.add(sortStudentButton);


        addStudentButton.addActionListener(e -> {
            try {
                addBtnClicked();
            }catch (IllegalArgumentException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        deleteStudentButton.addActionListener(e-> remBtnClicked());

        searchStudentButton.addActionListener(e->{
            try{
                findBtnClicked();
            }catch (StudentNotFoundException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        sortStudentButton.addActionListener(e-> sortBtnClicked());
        
        // JTable
        Object[] headers = new String[] {"ФИО", "ID", "Средний балл"};
        Object[][] table = new String[students.size()][headers.length];

        for(int i = 0; i < students.size(); i++){
            table[i][0] = students.get(i).getName();
            table[i][1] = ((Integer)(students.get(i).getId())).toString();
            table[i][2] = ((Double)(students.get(i).getAvgPoint())).toString();
        }

        studTable = new JTable( new DefaultTableModel(table, headers)){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };

        JTableHeader header = studTable.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);


        getContentPane().add(new JScrollPane(studTable), BorderLayout.CENTER);
        getContentPane().add(jpanel, BorderLayout.NORTH);

        setVisible(true);
    }

    private void addBtnClicked() throws IllegalArgumentException {
        String name = JOptionPane.showInputDialog("Введите ФИО студента");
        if(name.equals("")) 
            throw new EmptyStringExсeption();
        String id = JOptionPane.showInputDialog("Введите ID студента");
        String avgPoint = JOptionPane.showInputDialog("Введите средний балл студента");

        int idI;
        double avgPointD;
        try {
            idI = Integer.parseInt(id);
            avgPointD = Double.parseDouble(avgPoint);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Невозможно строку "+e.getMessage().substring(17) + " в число!");
        }

        students.add(new Student(name, idI, avgPointD));

        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        dtm.addRow(new Object[]{name, id, avgPoint});
    }

    private void remBtnClicked() {
        int c = studTable.getSelectedRowCount();
        if(c != 1) {
            JOptionPane.showMessageDialog(this, "Выберете ровно одну строку!");
            return;
        }
        c = studTable.getSelectedRow();
        students.remove(c);
        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        dtm.removeRow(c);
    }

    private void findBtnClicked() throws StudentNotFoundException {
        String s = JOptionPane.showInputDialog("Введите ФИО");
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(s)){
                JOptionPane.showMessageDialog(this, "Найден студент: "+
                        students.get(i).toString());
                return;
            }
        }
        throw new StudentNotFoundException(s);
    }
    
    private void sortBtnClicked() {
        quickSort(students, 0, students.size() - 1);

        DefaultTableModel dtm = (DefaultTableModel) studTable.getModel();

        for (int i = 0; i < students.size(); i++) {
            dtm.removeRow(i);
            Student st = students.get(i);
            dtm.insertRow(i, new Object[]{st.getName(), st.getId(), st.getAvgPoint()});
        }
    }

    public static void quickSort(ArrayList<Student> array, int low, int high) {
        if (array.size() == 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        double opora = array.get(middle).getAvgPoint();

        int i = low, j = high;
        while (i <= j) {
            while (array.get(i).getAvgPoint() < opora) {
                i++;
            }

            while (array.get(j).getAvgPoint() > opora) {
                j--;
            }

            if (i <= j) {
                Student temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

}