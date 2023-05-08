package aula0426;

public class AlunoPSC {
    private String nome;
    private String curso;
    private double ra;
    private double[] notas;
    private double freq;

    public AlunoPSC(String nome, String curso, double ra) {
        setNome(nome);
        this.setCurso(curso);
        setRa(ra);
        this.notas = new double[3];
        this.setFreq(0);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    private void setNome(String nome){
        this.nome = nome;
    }

    public String getCurso(){
        return this.curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public double getRa(){
        return this.ra;
    }

    private void setRa(double ra){
        this.ra = ra;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public boolean setNotas(double nota, int av){
        if (av <= 0 || av > 3){
            return false;
        } else {
            if(nota < 0 || nota > 10){
                return false;
            } else {
                this.notas[av] = nota;
                return true;
            }
        }
    }    
        
    public double getFreq(){
        return this.freq;
    }

    public boolean setFreq(double freq){
        if (freq >= 0) {
            this.freq = freq;
            return true;
        } else {
            return false;
        }
    }
    
}