import java.util.ArrayList;
import java.util.List;



/*
Предположим, вы пишите программу для on-line магазина У каждого товара есть наименование,
цена, рейтинг, количество штук на складе и т.д.
Ваша программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары и,
в зависимости от выбора пользователя, выводить список товаров в нужном порядке
(например, по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).
 */
public class Main {
    public static void main(String[] args) {
        List<Produkt> produktList = new ArrayList<>(List.of(
           new Produkt("Ноутбук Lenovo",3000,4.5,10),
           new Produkt("Аерогриль Cosori",75,4.2,7),
           new Produkt("Електрогітара Yamaha",6000,3.7,3),
           new Produkt("Бездротові навушники Sony",350,4.8,6),
           new Produkt("Смартфон Xiomi RedMi",210,3.9,5)
        ));
        System.out.println(produktList);
    }


}