package Homework3;


import java.io.*;
import java.util.Arrays;
import java.util.Random;

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

        Toyota camry = new Toyota();

        Toyota prado = new Toyota();

        Vaz samara = new Vaz();

        Vaz vedro = new Vaz();

        camry.musicOn();

        prado.musicOn();

        samara.crash();

        vedro.crash();

        //Задача №2
        //Необходимо:
        // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 2. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"

        // РЕШЕНИЕ

        String filePath = "D:\\Programming\\Java\\AblazzingStudy\\src\\Homework3\\Resourses\\my_firs_file.txt";

        FileWriter fileWriter = new FileWriter(filePath);

        fileWriter.write("Моя бабушка \n" + "читает газету жизнь");

        fileWriter.close();

        FileReader fileReader = new FileReader(filePath);

        String line;

        String result = "";

        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (((line = bufferedReader.readLine()) != null)) {
                result = result.concat(line + "");
            }
            System.out.println(result);
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

        String reportPath = "D:\\Programming\\Java\\AblazzingStudy\\src\\Homework3\\Resourses\\report.txt";

        FileWriter fileWriter1 = new FileWriter(reportPath);

        fileWriter1.write("доходы = " + record.getIncomes() + ", расходы = " + record.getOutcomes());

        fileWriter1.close();

        //Продвинутый уровень
        //Задача №1
        // Сделать задачу №1 (1 и 2 пункты) из базовой.
        // 1. Создать класс CarFactory, у которого есть два статических метода: создать жигули, создать toyota.
        // 2. Создать 20 тойот, 20 жигулей с помощью CarFactory, положить их в один массив.
        // 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
        // и вызвать характерные для нее методы.

        //РЕШЕНИЕ

        Car[] factoryResult = new Car[40];

        for (int i = 0; i < 40; i++) {

            if (i % 2 == 0) {
                factoryResult[i] = CarFactory.createVaz();
            } else factoryResult[i] = CarFactory.createToyota();
        }
        for (Car car : factoryResult) {
            if (car instanceof Vaz) {
                ((Vaz) car).crash();
            } else if (car instanceof Toyota) {
                ((Toyota) car).musicOn();
            }
        }

        Random random = new Random(1);
        // random.nextInt(10000);
        //Задача №2
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов, с разными доходами и расходами (используй random)
        // 4. Записать в файл "report.txt" все данные из отчетов.
        // 5. Прочитать файл report.txt, просуммировать все доходы и вывести на экран, тоже самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

        //РЕШЕНИЕ

        int finalIncomes = 0;
        int finalOutcomes = 0;

        FinancialRecord[] financialRecords = new FinancialRecord[10];
        for (int i = 0; i < financialRecords.length; i++) {
            int j = random.nextInt(10000);
            int k = random.nextInt(10000);
            financialRecords[i] = new FinancialRecord(j,k);
        }
       // System.out.println(Arrays.toString(financialRecords));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reportPath));

        String mathResult = "";

        for (FinancialRecord math : financialRecords) {
            mathResult += math.toString() + "\n";
        }
        mathResult = mathResult.substring(0, mathResult.length() - 1);
        bufferedWriter.write(mathResult);
        bufferedWriter.close();

        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(reportPath));
        while (bufferedReader1.ready()){

            String string = bufferedReader1.readLine();
            String[] strings = string.split(":");
            int income = Integer.parseInt(strings[0]);
            int outcome = Integer.parseInt(strings[1]);
            finalIncomes += income;
            finalOutcomes += outcome;
        }
        bufferedReader1.close();
        System.out.println("Общие доходы - " + finalIncomes + ", общие расходы - " + finalOutcomes);
    }
}