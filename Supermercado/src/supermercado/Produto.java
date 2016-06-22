package supermercado;

public abstract class Produto {
    private String nome;
    private float preco;
   
public Produto(String Nome){
    nome= Nome;
}

    float precoUnitario(){
        return preco;
    }

    String getNome() {
        return nome;
    }
}