package Homework3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Homework3 {
    public static void main(String[] args) throws IOException {

//Базовый уровень
        //Задача №1
        //Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
        //останавливаться, включать фары. У жигули есть особенность: она ломается. У Toyota особенность: включает музыку
        //Необходимо:
        // 1. Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
        // 2. Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
        // Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
        // 3. Создать два экземпляра этих классов, и вызвать методы характерные для них

        //РЕШЕНИЕ

        Toyota camry = new Toyota("Camry");

        Toyota prado = new Toyota("Prado");

        Vaz samara = new Vaz("Samara");

        Vaz bogdan = new Vaz("Bogdan");

        camry.musicOn();

        prado.musicOn();

        samara.crash();

        bogdan.crash();

        //Задача №2
        //Необходимо:
        // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 2. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"

        // РЕШЕНИЕ

        String filePath = "D:\\Programming\\Java\\AblazzingStudy\\src\\Homework3\\my_firs_file.txt";



        FileWriter fileWriter = new FileWriter(filePath);

        fileWriter.write("Моя бабушка \n" + "читает газету жизнь");

        fileWriter.close();

        FileReader fileReader = new FileReader(filePath);

        String line;

        String result = "";

       try (BufferedReader bufferedReader = new BufferedReader(fileReader)){
           while (((line = bufferedReader.readLine()) != null)){
             result = result.concat(line + "");
           }
           System.out.print(result);
       }



        //Задача №3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300

        // РЕШЕНИЕ

        FinancialRecord record = new FinancialRecord(500, 300);

       String reportPath = "D:\\Programming\\Java\\AblazzingStudy\\src\\Homework3\\report.txt";

       String reportIncomes = String.valueOf(record.getIncomes());
       String reportOutcomes = String.valueOf(record.getOutcomes());

        FileWriter fileWriter1 = new FileWriter(reportPath);

        fileWriter1.write("Доходы = " + reportIncomes + ", расходы = " + reportOutcomes);

        fileWriter1.close();



    }
}