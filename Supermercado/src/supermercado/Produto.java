package supermercado;

public class Produto {
    private String nome;
    private float preco;
   
public Produto(String Nome, float Preco){
    nome= Nome;
    preco= Preco;
}

    float precoUnitario(){
        return preco;
    }

    String getNome() {
        return nome;
    }
}