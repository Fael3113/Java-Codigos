package aula0426;

public class Main {
    Nota aluno = new Nota();
        
    aluno.setNota(6.3, 0);
    aluno.setNota(7.4, 1);
    aluno.setNota(8.5 , 2);
    System.out.printf("Media = %.2f\n", aluno.calcMedia());
    aluno.print();
}
