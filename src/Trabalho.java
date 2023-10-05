public class Trabalho {

    private int trabalhoId;
    private static int proximoId=1;
    private String titulo;
    private String resumo;

    public Trabalho(String titulo, String resumo) {
        this.trabalhoId = proximoId;
        proximoId++;
        this.titulo = titulo;
        this.resumo = resumo;
    }

    // GETTERS E SETTERS
    /**
     * @return int return the trabalhoId
     */
    public int getTrabalhoId() {
        return trabalhoId;
    }

    /**
     * @param trabalhoId the trabalhoId to set
     */
    public void setTrabalhoId(int trabalhoId) {
        this.trabalhoId = trabalhoId;
    }

    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the resumo
     */
    public String getResumo() {
        return resumo;
    }

    /**
     * @param resumo the resumo to set
     */
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

}
