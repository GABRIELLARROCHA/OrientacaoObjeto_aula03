package escolaAula03Ex01;

//Questão 01 - Crie um projeto chamado escola com a classe Aluno
// Siga o  diagrama a seguir para incluir os atributos e encapsule-os.
// Não se esqueça de alterar a  visibilidade dos atributos para private.

//Questão 02 - Execute as seguintes validações dentro dos métodos criados:
//a) Dentro de setNota1 e setNota2, valide se o parâmetro recebido está entre 0 e 10.
//b) Dentro de setNome, verifique se o nome contém até 30 caracteres. Se houver mais,  mostre na tela a mensagem: “O nome deve conter até 30 caracteres.”
//OBS: Pesquise pelo comando length do Java.

// Crie uma classe chamada ControleAluno e inclua o método main().
// Use os getteres e setters criados para preencher os dados de um Aluno
// Teste se as validações dos métodos estão funcionando passando como parâmetro os
// seguintes exemplos de valores:
//- Um nome com mais de 30 caracteres;
//- Uma nota1 maior que 10;
//- Uma nota2 com valor negativo.

import escolaAula03Ex01.Entidades.Aluno;

public class ControleAluno {
    public static void main(String[] args) {

        Aluno aluno01 = new Aluno();
        aluno01.setNome("Gabriella Germano Rocha Oliveira");
        aluno01.setNota01(11);
        aluno01.setNota02(-2);

        System.out.println( "Nome: " + aluno01.getNome()+ " nota1: " + aluno01.getNota01()+ " nota2 : " + aluno01.getNota02());


    }
}
