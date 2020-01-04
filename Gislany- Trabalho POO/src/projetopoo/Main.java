package projetopoo;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Aluno>  lista = new ArrayList<>();
        
    
       int op = 10;
        while(op != 0) {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 - Cadastro 2 - Mostrar"));

                if (op == 1) {
                    Aluno aluno = new Aluno();
                    aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
                    aluno.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota")));
                    aluno.setMateria(JOptionPane.showInputDialog("Digite o nome da matéria"));
                   aluno.setProfessor(JOptionPane.showInputDialog("Digite o nome do professor da matéria " +aluno.getMateria()));
                    lista.add(aluno);
                }





            if (op == 2) {
                for (Aluno aluno : lista) {
                    System.out.println("Nome: " + aluno.getNome() + " Nota: " +aluno.getNota() + " Matéria: " +aluno.getMateria() + " Professor: " +aluno.getProfessor());
                }
            }

        }





    }
}
