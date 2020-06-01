package ru.progwards.java1.lessons.Test2;


import org.telegram.telegrambots.ApiContextInitializer;
import ru.progwards.java1.telegrambot.ProgwardsTelegramBot;

public class ConverseBot extends ProgwardsTelegramBot {

//    @Override
//    public String processMessage(Integer userid, String text) {
//        //checkTags(text);
//        return "Под твой запрос подходит: \n" + extract(checkTags(text));
//    }


    @Override
    public String processMessage(Integer userid, String text) {
        return super.processMessage(userid, "Под твой запрос подходит: \n" + extract(checkTags(text)));
    }

    public static void main(String[] args) {
        System.out.println("Hello Bot!");
        ApiContextInitializer.init();

        ProgwardsTelegramBot bot = new ProgwardsTelegramBot();
        bot.username = "Converse24bot";
        bot.token = "1254656732:AAF06x-48nm7RkE-pgbFkP66LsYreYanP8g";

        bot.addTags("Пицца гавайская", "гавайск, пицц, ананас, куриц");
        bot.addTags("Пицца маргарита", "маргарит, пицц, моцарелла, сыр, кетчуп, помидор");
        bot.addTags("Пицца пеперони", "пеперони, пицц, салями, колбас, сыр, кетчуп, помидор");
        bot.start();
    }
}
