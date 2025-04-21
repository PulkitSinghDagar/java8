//package StreamApi;
//
//public class StreaamApipractice {
//    public static int cube(int x) {
//        return x * x * x;
//    }
//    public static void main(String[] args) {
//
//
//        //make a list and then find the even in them
//
////        List<Integer> list = new ArrayList<>(10);
////        list.add(1);
////        list.add(1,3);
//        //without Stream api
//
//        List<Integer> list = List.of(1, 2, 34, 5, 7, 8, 9);
//        List<Integer> ListEven = new ArrayList<>();
//
//        for (Integer i : list) {
//            if (i % 2 == 0) {
//                ListEven.add(i);
//            }
//
//        }
//        System.out.println(ListEven);
//
//        Stream<Integer> stream = list.stream();
//        Stream<Integer> streams = list.stream();
//            //below i sthe logic to itegate the list find even or odd and compare them
////        List<Integer> even = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
////       List<Integer> odd = streams.filter(i -> i % 2 != 0).collect(Collectors.toList());
////        System.out.println("api"+even);
////          System.out.println("api"+odd);
////          if (even.size()> odd.size()){
////              System.out.println(even.size());
////
////          }else {
////              System.out.println(odd.size());
////          }
//        List<Integer> newList1 = stream.filter(i -> i > 30).collect(Collectors.toList());
//        System.out.println("newList1 = " + newList1);
//    }
//
//
//}
