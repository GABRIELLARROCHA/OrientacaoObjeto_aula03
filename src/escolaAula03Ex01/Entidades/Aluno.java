package escolaAula03Ex01.Entidades;

public class Aluno {
    private String nome;
    private double nota01;
    private double nota02;

    // para criar get e set caminho: botao direito do mause selecionar a opcao : generate/ getter and setter.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() <= 30 ){
            this.nome = nome;
        }
        else {
            System.out.println("O nome deve conter até 30 caracteres.");
        }
    }

    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        if (nota01 >= 0 && nota01 <= 10) {
            this.nota01 = nota01;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        if (nota02 >= 0 && nota02 <= 10) {
            this.nota02 = nota02;
        } else {
            System.out.println("Valor inválido");
        }
    }

}

