import java.util.*;

public class Plalindrome {


    /**
     * 验证一段字符串中是否存在回文件字符串
     *
     * @param args
     */
    public static void main(String[] args) {
//        String string = "lkafmabcdeffedcbaflkopokopok";

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一段字符串:");
        String string = scanner.next();

        List list = new ArrayList();
        char[] chars = string.toCharArray();

        for (int i = 0; i <= chars.length - 1; i++) {
            list.add(chars[i]);
        }

        System.out.println(list);

        List list1 = new ArrayList();
        List list2 = new ArrayList();

        int j = 1;
        for (int i = 0; i <= chars.length - 1; i++) {
            list1.add(chars[i]);
            Collections.reverse(list1);
            System.out.print(list1);

            list2 = list.subList(j, chars.length);
            System.out.println(list2);

            List list3 = new ArrayList();
            for (int m = 0; m < list1.size(); m++) {
                System.out.print(list1.get(m));
                if (list2.size() <= m + 1) {
                    break;
                }
                if (list1.get(m) == list2.get(m)) {
                    list3.add(list1.get(m));
                } else if (list1.get(m) == list2.get(m + 1)) {
                    list3.add(list2.get(m + 1));
                } else {
                    break;
                }
            }

            if (list3.size() >= 2) {
                System.out.print(list3);
                System.out.println("是回文字符串");
            }

            System.out.println("=====================");
            Collections.reverse(list1);
            j++;

        }
    }

}
