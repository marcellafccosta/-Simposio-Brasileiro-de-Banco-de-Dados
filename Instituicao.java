abstract class Instituicao {
    private int instituicaoId;
    private String instituicaoNome;



    public Instituicao(int instituicaoId, String instituicaoNome) {
        this.instituicaoId = instituicaoId;
        this.instituicaoNome = instituicaoNome;
    }


    // GETTERS E SETTERS
    /**
     * @return int return the instituicaoId
     */
    public int getInstituicaoId() {
        return instituicaoId;
    }

    /**
     * @param instituicaoId the instituicaoId to set
     */
    public void setInstituicaoId(int instituicaoId) {
        this.instituicaoId = instituicaoId;
    }

    /**
     * @return String return the instituicaoNome
     */
    public String getInstituicaoNome() {
        return instituicaoNome;
    }

    /**
     * @param instituicaoNome the instituicaoNome to set
     */
    public void setInstituicaoNome(String instituicaoNome) {
        this.instituicaoNome = instituicaoNome;
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
