import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Minicurso {
    
    private Date data;
    private Time horaInicio;
    private Time horaFim;
    private Pessoa pessoa;


    public Minicurso(Date data, Time horaInicio, Time horaFim, Pessoa pessoa) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.pessoa = pessoa;
    }


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


     public ArrayList<Minicurso> listaParticipantes() {
        return null;
    }

    public void criarMinicurso() {

    }

    public void editarMinicurso() {

    }

    public void excluirMinicurso() {

    }

    public void pesquisarMinicurso() {

    }

}
