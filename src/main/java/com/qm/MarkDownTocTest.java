package com.qm;

import com.github.houbb.markdown.toc.core.impl.AtxMarkdownToc;

import java.io.File;

/**
 * @author qiumeng
 * @version 1.0
 * @description
 * @date 2021/7/4 19:45
 */
public class MarkDownTocTest {



    public static void main(String[] args) {

        File emptyFile = new File("");
        StringBuilder sb = new StringBuilder();
        sb.append(emptyFile.getAbsolutePath());
        try {
            AtxMarkdownToc.newInstance()
                    .subTree(true)
                    .genTocDir(sb.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

    }


}
