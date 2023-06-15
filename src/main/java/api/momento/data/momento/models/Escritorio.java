package api.momento.data.momento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity//Mostra ao SPRING que é uma tabela
@Table(schema = "escritorio")
public class Escritorio {
    @Id
    int escritorio_id;
    String endereco;
    String cep;

    String cidade;

    String estado;

    String pais_id;

    public int getEscritorio_id() {
        return escritorio_id;
    }

    public void setEscritorio_id(int escritorio_id) {
        this.escritorio_id = escritorio_id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais_id() {
        return pais_id;
    }

    public void setPais_id(String pais_id) {
        this.pais_id = pais_id;
    }
}
