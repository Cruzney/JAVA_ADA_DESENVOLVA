package br.com.ada.desenvolva;


// Calcular a quantidade de horas entre dois horários
// Dado que eu possua o horário de 08:00 e 12:00,
// desejo saber quantas horas se passaram

import java.time.LocalTime;

public class CalculaData {
    LocalTime first = LocalTime.now();
    LocalTime second = LocalTime.now();

    public void calculateHours(LocalTime first, LocalTime second) {
        var hours = first.getHour() - second.getHour();
        System.out.println("Horas passadas: " + hours);
    }

    public static void main(String[] args) {
        CalculaData data = new CalculaData();
        data.calculateHours(data.first, data.second);
    }


}
