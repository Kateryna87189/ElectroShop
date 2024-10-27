import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


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
           new Produkt("Ноутбук Lenovo",750.50,4.5,10),
           new Produkt("Аерогриль Cosori",75.99,4.2,7),
           new Produkt("Електрогітара Yamaha",6000.2,3.7,3),
           new Produkt("Бездротові навушники Sony",350.1,4.8,6),
           new Produkt("Смартфон Xiomi RedMi",210.2,3.9,5)
        ));
        System.out.println(produktList);
        Scanner scanner = new Scanner(System.in);
        int chois=-1;

        while (chois!=0){
            System.out.println("\nОберіть критерій сортування або 0 для завершення роботи програми");
            System.out.println("1 - по ціні (зростання)");
            System.out.println("2 - по ціні (зменшення)");
            System.out.println("3 - по рейтингу (зменшення)");
            System.out.println("4 - по кількості на складі (зменшення)");
            System.out.println("ваш вибір");

            chois = scanner.nextInt();

            if (chois==0){
                System.out.println("вихід з програми.");
                break;
            }
            Comparator<Produkt> comparator = null;

            //присвоєння компаратора на основі вибору користувача
            if (chois==1){
                comparator = new PriceAscendingComparator();
            }else if (chois==2){
                comparator = new PriceDescendingComparator();
            }else if (chois==3){
                comparator = new RatingDescendingComparator();
            }else if (chois==4){
                comparator = new QuantityDescendingComparator();
            }
            if (comparator!=null){
                produktList.sort(comparator);
                System.out.println("Список товарів: ");
                for (Produkt produkt:produktList){
                    System.out.println(produkt);
                }
            }else {
                System.out.println("вибір не вірний. Спробуйте ще раз");
            }


        }
    }


}