package ch08;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by scn on 2017/7/5.
 * 使用foreach循环来遍历集合元素
 */
public class ForeachTest {
    public static void main(String[] args) {
        // 创建一个集合
        Collection books = new HashSet();
        books.add("轻量级Java EE企业应用实战");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        for (Object obj : books) {
            // 此处的book变量也不是集合元素本身
            String book = (String)obj;
            System.out.println(book);
            if (book.equals("疯狂Java讲义")) {
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
