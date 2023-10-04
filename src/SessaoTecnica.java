import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;


public class SessaoTecnica {
    private Date data;
    private Time horaInicio;
    private Time horaFim;
    private Pessoa pessoa;

    
    
//GETTERS E SETTERS
    /**
     * @return Date return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return Time return the horaInicio
     */
    public Time getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return Time return the horaFim
     */
    public Time getHoraFim() {
        return horaFim;
    }

    /**
     * @param horaFim the horaFim to set
     */
    public void setHoraFim(Time horaFim) {
        this.horaFim = horaFim;
    }

    /**
     * @return Pessoa return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }



    public ArrayList<SessaoTecnica> listaParticipantes() {
        return null;
    }

    public void criarSessaoTecnica() {

    }

    public void editarSessaoTecnica() {

    }

    public void excluirSessaoTecnica() {

    }

    public void pesquisarSessaoTecnica() {

    }

}
