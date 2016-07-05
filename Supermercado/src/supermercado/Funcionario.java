package supermercado;

class Funcionario {

    protected String nomeFuncionario;
    protected int idFuncionario;

    Funcionario(String nome) {
        this.nomeFuncionario = nome;
        //idFuncionario = (int) (Math.random()*100); //FIXME pode criar funcionários com o mesmo ID FIXED
        FuncionariosBD.insereFuncionario(this);
        System.out.println("Funcionario registrado com sucesso: ");
        System.out.println("");
        System.out.println("Nome: " + nomeFuncionario);
        System.out.println("Seu numero de identificação é: " + idFuncionario);
        System.out.println("");
    }

    public String getNome() {
        return nomeFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

}
