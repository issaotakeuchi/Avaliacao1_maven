package Avaliacao1;

public class Hotel {
    private Integer id;
    private String nomeFilial;
    private String rua;
    private Integer numero;
    private String cidade;
    private String estado;
    private Boolean eh5Estrelas;

    public Hotel(String nomeFilial, String rua, Integer numero, String cidade, String estado, Boolean eh5Estrelas) {
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.eh5Estrelas = eh5Estrelas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public Boolean getEh5Estrelas() {
        return eh5Estrelas;
    }

    public void setEh5Estrelas(Boolean eh5Estrelas) {
        this.eh5Estrelas = eh5Estrelas;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", nomeFilial='" + nomeFilial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", eh5Estrelas=" + eh5Estrelas +
                '}';
    }
}
