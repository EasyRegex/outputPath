package com.company;

import regex.*;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author SuperMaxine
 */
public class Main {

    public static void main(String[] args) {
        // String regex = "^(a|\\w+)+$";
        // String regex = "<\\*(?:[^<*]|\\*|<|<\\*(?:[\\s\\S])*\\*>)*\\*>";
        // String regex = "^(a|(?=@bba)[@#]\\w+)+$";

        // String regex = "^(a|(?=abc)\\w+)+$"; //success
        // String regex = "(^[ \\t]*)\\[(?!\\[)(?:([\"'$`])(?:(?!\\2)[^\\\\]|\\\\.)*\\2|\\[(?:[^\\]\\\\]|\\\\.)*\\]|[^\\]\\\\]|\\\\.)*\\]"; //ReDos 41行 success

        String regex = "((?:^|[&(])[ \\t]*)for(?: ?\\/[a-z?](?:[ :](?:\"[^\"]*\"|\\S+))?)* \\S+ in \\([^)]+\\) do"; //ReDos 45行 //success
        // String regex = "((?:^|[&(])[ \\t]*)if(?: ?\\/[a-z?](?:[ :](?:\"[^\"]*\"|\\S+))?)* (?:not )?(?:cmdextversion \\d+|defined \\w+|errorlevel \\d+|exist \\S+|(?:\"[^\"]*\"|\\S+)?(?:==| (?:equ|neq|lss|leq|gtr|geq) )(?:\"[^\"]*\"|\\S+))"; //ReDos 46行 success
        // String regex = "((?:^|[&(])[ \\t]*)set(?: ?\\/[a-z](?:[ :](?:\"[^\"]*\"|\\S+))?)* (?:[^^&)\\r\\n]|\\^(?:\\r\\n|[\\s\\S]))*"; //ReDos 47行 success
        // String regex = "\"(?:[^\\\\\"\\r\\n]|\\\\(?:[abfnrtv\\\\\"]|\\d+|x[0-9a-fA-F]+))*\""; //ReDos 49行
        // String regex = "^\\|={3,}(?:(?:\\r?\\n|\\r).*)*?(?:\\r?\\n|\\r)\\|={3,}$"; //ReDos 42行
        Pattern p = Pattern.compile(regex);
        Pattern.printObjectTree(p.root);
        Analyzer a = new Analyzer(p, 7);



    }

}
