package com.cydeo.traderTask;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@AllArgsConstructor
public class Trader {
    private String name;
    private String city;

}
@Data
@AllArgsConstructor
class Transaction {
    private Trader trader;
    private int year;
    private int value;
}

class TraderData {

    public static List<Transaction> getAll() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        return transactions;
    }

}

class TransactionTest {

    public static void main(String[] args) {


        System.out.println("1- Find all transactions in the year 2011 and sort them by value (small to high)");
        TraderData.getAll().stream()
                .filter(p->p.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                        .forEach(System.out::println);

        System.out.println("--------------------------------");
        System.out.println("2. What are all the unique cities where the traders work?");
            TraderData.getAll().stream()
                    .map(p->p.getTrader().getCity())
                    .distinct()
                    .forEach(System.out::println);


        System.out.println("--------------------------------");
        System.out.println("3. Find all traders from Cambridge and sort them by name.");

        TraderData.getAll().stream()
                        .map(Transaction::getTrader)
                                .filter(trader -> trader.getCity().equalsIgnoreCase("cambridge"))
                                        .sorted(Comparator.comparing(Trader::getName))
                                                .forEach(System.out::println);


        System.out.println("--------------------------------");
        System.out.println("4. Return a string of all traders’ names sorted alphabetically.");

        String str=TraderData.getAll().stream()
                .map(p -> p.getTrader())
                .sorted(Comparator.comparing(Trader::getName))
                .map(p -> p.getName())
                .collect(Collectors.joining(","));
        System.out.println(str);

        System.out.println("--------------------------------");
        System.out.println("5. Are any traders based in Milan?");

        boolean milan = TraderData.getAll().stream()
                .anyMatch(p -> p.getTrader().getCity().equalsIgnoreCase("milan"));
        System.out.println(milan);

        System.out.println("--------------------------------");
        System.out.println("6. Print the values of all transactions from the traders living in Cambridge.");

        Optional<Integer> reduce = TraderData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::sum);
        System.out.println(reduce.get());

        TraderData.getAll().stream()
                        .map(Transaction::getValue)
                                .forEach(System.out::println);

        System.out.println("--------------------------------");
        System.out.println("7. What is the highest value of all the transactions?");

        Optional<Integer> integer = TraderData.getAll().stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(p -> p.getValue());
        System.out.println(integer.get());
        System.out.println("-------------");

        Optional<Integer> reduce1 = TraderData.getAll().stream()
                .map(p -> p.getValue())
                .reduce(Integer::max);
        System.out.println(reduce1.get());


        System.out.println("--------------------------------");
        System.out.println("8. Find the transaction with the smallest value.");

        Optional<Integer> reduce2= TraderData.getAll().stream()
                .map(p->p.getValue())
                .reduce(Integer::min);
        System.out.println(reduce2.get());


    }

}
