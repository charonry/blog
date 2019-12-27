package com.charon.blog.utils;

import org.junit.Test;

import static com.charon.blog.util.MarkdownUtils.markdownToHtmlExtensions;

/**
 * @description:
 * @author: charon
 * @create: 2019-12-25 11:43
 **/
public class MarkdownUtilsTest {

    @Test
    public void test(){
        String table = "| hello | charon  | crane   |\n" +
                "| ----- | ---- | ----- |\n" +
                "| 斯巴达  | 勇士  | 300    |\n" +
                "| 阿斯顿马丁  | 兰博基尼 | 英菲尼迪 |\n" +
                "\n";
        String a = "[imCoding 爱编程](http://www.cahron.cn)";
        System.out.println(markdownToHtmlExtensions(table));
    }
}
