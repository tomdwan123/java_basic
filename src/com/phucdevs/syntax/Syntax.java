package com.phucdevs.syntax;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Phuc.Le
 */
public class Syntax {

    private static final String REGEX_EMAIL = "";

    public static void main(String[] args) {
        undercoreVariable();
        initWithArrayAsList();
        initWithCollectionsSingleton();
        returnWithCollectionsEmpty();
        initWithListOf();
        comparatorWithNullValue();
        predicateWithNot();
    }

    static void undercoreVariable() {
        long nonUndercore = 1000000;
        long withUndercore = 1_000_000;
    }

    /* Init arrayList with 1 line */
    static void initWithArrayAsList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> names = Arrays.asList("John", "Marry", "Tony");
    }

    /* If you need a collection to store the single item, you should use: */
    static void initWithCollectionsSingleton() {
        var singletonSet = Collections.singleton(1);
        var singletonList = Collections.singletonList(1);
        var singletonMap = Collections.singletonMap("Tony", 1);
    }

    /* Stop returning null value as a collection, return an empty collection instead. */
    static Object returnWithCollectionsEmpty() {
        List<String> emails = List.of();
        if (emails == null) {
            return Collections.emptyList(); // return empty list
        }

        return Collections.emptySet(); // return empty set
        // return Collections.emptyMap(); // return empty map
    }

    /* Create list with some features: */
    /* Unmodifiable: cannot add, update, delete */
    /* Cannot add null value*/
    /* */
    static void initWithListOf() {
        var numberList = List.of();
        var number2List = List.of(1);
        var numberSet = Set.of();
        var number2Set = Set.of(1);
        var numberMap = Map.of();
        var number2Map = Map.of("John", 1);
    }

    /* Comparator with null value in java stream */
    static void comparatorWithNullValue() {
        var list = Arrays.asList(1, null, 2, null);

        // before refactor
        list.sort(Comparator.naturalOrder()); // throw java.lang.NullPointerException

        // after refactor
        list.sort(Comparator.nullsFirst(Comparator.naturalOrder())); // output: null, null, 1, 2
    }

    static void predicateWithNot() {
        var games = Arrays.asList("Dota", "Fighting");

        // before refactor
        games.stream()
            .filter(g -> !g.isEmpty())
                .collect(Collectors.toList());

        // after refactor
        games.stream()
                .filter(Predicate.not(String::isEmpty))
                .collect(Collectors.toList());
    }
}
