package javaStudy;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sale {
    String fruitName;
    int price;
    float discount;

    public Sale(String fruitName, int price, float discount) {
        this.fruitName = fruitName;
        this.price = price;
        this.discount = discount;
    }


    public static void main(String[] args) {

        List<Sale> saleList = Arrays.asList(
                new Sale("Apple", 5000, 0.05f),
                new Sale("Grape", 3000, 0.1f),
                new Sale("Orange", 4000, 0.2f),
                new Sale("Tangerine", 2000, 0)
        );

        Stream<Sale> saleStream = saleList.stream();
        // build.gradle에서 가져온 라이브러리 Pair
        // 스트림 사용해서 형변환, 계산을 자유로이 할 수 있음.
        saleStream.map(sale -> Pair.of(sale.fruitName, sale.price * (1 - sale.discount)))
                .forEach(pair -> System.out.println(pair.getLeft() + " 실구매가:" + pair.getRight() + "원 입니다."));

        // reduce, 첫 렐리먼트(기준값) + 연산 메서드 = 압축 결과
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(list.stream().reduce(0, Integer::sum));
    }
}

