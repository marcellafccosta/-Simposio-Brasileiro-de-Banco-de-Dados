abstract class Pessoa {

    private int pessoaId;
    private String pessoaNome;
    private String pessoaEndereco;
    private String pessoaTelefone;

    public Pessoa(int pessoaId, String pessoaNome, String pessoaEndereco, String pessoaTelefone) {
        this.pessoaId = pessoaId;
        this.pessoaNome = pessoaNome;
        this.pessoaEndereco = pessoaEndereco;
        this.pessoaTelefone = pessoaTelefone;
    }

    // GETTERS E SETTERS

    /**
     * @return int return the pessoaId
     */
    public int getPessoaId() {
        return pessoaId;
    }

    /**
     * @param pessoaId the pessoaId to set
     */
    public void setPessoaId(int pessoaId) {
        this.pessoaId = pessoaId;
    }

    /**
     * @return String return the pessoaNome
     */
    public String getPessoaNome() {
        return pessoaNome;
    }

    /**
     * @param pessoaNome the pessoaNome to set
     */
    public void setPessoaNome(String pessoaNome) {
        this.pessoaNome = pessoaNome;
    }

    /**
     * @return String return the pessoaEndereco
     */
    public String getPessoaEndereco() {
        return pessoaEndereco;
    }

    /**
     * @param pessoaEndereco the pessoaEndereco to set
     */
    public void setPessoaEndereco(String pessoaEndereco) {
        this.pessoaEndereco = pessoaEndereco;
    }

    /**
     * @return String return the pessoaTelefone
     */
    public String getPessoaTelefone() {
        return pessoaTelefone;
    }

    /**
     * @param pessoaTelefone the pessoaTelefone to set
     */
    public void setPessoaTelefone(String pessoaTelefone) {
        this.pessoaTelefone = pessoaTelefone;
    }

    public void incluir() {

    }

    public void editar() {

    }

    public void excluir() {

    }

    public void pesquisar() {

    }

}
