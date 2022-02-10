package javaStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lamda {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("korea");
        list.add("japan");
        list.add("france");

        // 개별 엘리먼츠 변수로 두고, 각 엘리턴츠에 처리
        // 파라미터가 1개면 "파라미터::메서드" 형식으로 간결하게 표현 가능
        Stream<String> stream = list.stream();
        stream.map(String::toUpperCase)
                .forEach(System.out::println); // 스트림의 close 사용 할 수 없음

        // 스트림 데이터의 흐름, 원본 데이터 소스를 바꾸지 않는다.
        System.out.println(list);

        // list -> list
        List<String> list2 = new ArrayList<>();
        list2.add("서울");
        list2.add("대구");
        list2.add("부산");
        list2.add("서울");

        listToList(list2);
        listToSet(list2);

        String[] arr = {"SQL", "Java", "Python"};
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(e -> System.out.println(e));
    }

    private static void listToList(List<String> list2) {
        List<String> result = list2.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    private static void listToSet(List<String> list2) {
        // list -> set
        Set<String> set = list2.stream()
                .filter(it -> "서울".equals(it))
                .collect(Collectors.toSet());
        System.out.println(set);
    }
}
