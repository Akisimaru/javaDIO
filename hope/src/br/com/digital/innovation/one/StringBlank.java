package br.com.digital.innovation.one;

import java.util.stream.Collectors;

public class StringBlank {
    public static void main(String[] args) {
        String espaco = "";
        System.out.println(espaco != null && espaco.length() == 0 && espaco.chars().allMatch( c -> c == ' '));
        System.out.println(espaco.isBlank());

        String html = "<html>\n<head>\n<head>\n<body>\n<div>\n<div>\n<body>\n<html>";
        System.out.println(html.lines().map( s -> "(TAG) :: " + s).collect(Collectors.toList()));


    }

}
