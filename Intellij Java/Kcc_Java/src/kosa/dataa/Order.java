package kosa.dataa;

import java.util.*;

public class Order {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        LinkedList<String> Food = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 주문요청  2. 주문처리 3. 주문 대기 4. 매출액 총액 5. 종료");
            String num = sc.nextLine();
            switch (num) {
                case "1":
                    System.out.print("주문 음식 :");
                    String foodName = sc.nextLine();
                    System.out.print("주문 가격 :");
                    int price = sc.nextInt();
                    sc.nextLine();

                    map.put(foodName, price);
                    break;
                case "2":
                    Set set = map.entrySet();
                    Iterator iterator = set.iterator();
                    while (iterator.hasNext()) {
                        Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) iterator.next();
                        Food.offer(e.getKey());
                        Food.offer(e.getValue() + "");
                    }

                    while (!Food.isEmpty()) {
                        System.out.print(Food.poll());
                    }
                    break;
                case "3":

                    break;
                case "4":
                    Collection<Integer> values = map.values();
                    Iterator<Integer> iter = values.iterator();

                    int total = 0;
                    while (iter.hasNext()) {
                        total += iter.next();
                    }

                    System.out.println("매출액 총액:" + total);
                    break;
                case "5":
                    System.out.println("종료");
                    return;
            }
        }
    }

}
