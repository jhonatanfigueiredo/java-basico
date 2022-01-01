package poo20211119.model.entidades;

import poo20211119.model.excecoes.ExcecaoDeDominio;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

    private Integer numeroDoQuarto;
    private Date checkIn;
    private Date checkOut;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(Integer numeroDoQuarto, Date checkIn, Date checkOut) {
        setDatas(checkIn, checkOut);
        this.numeroDoQuarto = numeroDoQuarto;
    }

    public Integer getNumeroDoQuarto() {
        return numeroDoQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setDatas(Date checkIn, Date checkOut) {
        Date hoje = new Date();
        if (checkIn.before(hoje) || checkOut.before(hoje)) {
            throw new ExcecaoDeDominio("A reserva deve ser solicitada para datas futuras.");
        }
        if (!checkOut.after(checkIn)) {
            throw new ExcecaoDeDominio("A data de check-out deve ser posterior à data de check-in.");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long periodoDeEstadia() {
        long periodo = checkOut.getTime() - checkIn.getTime(); // saída em milissegundos
        return TimeUnit.DAYS.convert(periodo, TimeUnit.MILLISECONDS); // conversão para dias
    }

    @Override
    public String toString() {
        return "Quarto: "
                + numeroDoQuarto
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + periodoDeEstadia()
                + " noites.";
    }
}
