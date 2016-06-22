package supermercado;

import java.util.Objects;

public abstract class Produto {
    protected String nome;
    protected int preco;

    public int getPreco() {
        return preco;
    }

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

}