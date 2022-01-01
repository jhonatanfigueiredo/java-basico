package poo20211119;

import poo20211119.model.entidades.Reserva;
import poo20211119.model.excecoes.ExcecaoDeDominio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            // Reserva reserva = new Reserva(35, new Date(), sdf.parse("25/11/2021"));
            Reserva reserva = new Reserva(35, sdf.parse("05/01/2022"), sdf.parse("10/01/2022"));
            System.out.println(reserva);

            System.out.println("Atualizar datas:");
            // reserva.setDatas(sdf.parse("23/11/2021"), sdf.parse("21/11/2021"));
            reserva.setDatas(sdf.parse("20/02/2022"), sdf.parse("24/02/2022"));
            System.out.println(reserva);
        } catch (ParseException erro) {
            System.out.println("Data com formato inválido.");
        } catch (ExcecaoDeDominio erro) {
            System.out.println("Erro na reserva: " + erro.getMessage());
        } catch (RuntimeException erro) {
            System.out.println("Não foi possível se conectar.");
        }
    }
}