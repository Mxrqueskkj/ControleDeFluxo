public class ExemploForAray {
    public static void main(String[] args) {
        String[] alunos = {"FELIPE","JONAS","JULIA","MARCOS" };
        //em arrays o indice inicia em zero
        for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno do indice x=" + x + " é " + alunos[x] );
        }
        for (String aluno : alunos){
            System.out.println("o nome do aluno é " + aluno);
        }
    }
}
