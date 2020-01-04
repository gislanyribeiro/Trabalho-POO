package projetopoo;
public class Aluno {
   private String nome;
   private String materia;
   private double nota;
   private String professor;
   
    public void setNome(String nome){
        this.nome =  String.valueOf(nome.toUpperCase());
    }

    public String getNome(){
       return nome;
    }
    
     public void setMateria(String materia){
        this.materia =  String.valueOf(materia.toUpperCase());
    }

    public String getMateria(){
       return materia;
    }
    
     public void setNota(double nota){
        this.nota = nota;
    }

    public double getNota(){
       return nota;
    }
    
     public void setProfessor(String professor){
        this.professor =  String.valueOf(professor.toUpperCase());
    }

    public String getProfessor(){
       return professor;
    }
}
