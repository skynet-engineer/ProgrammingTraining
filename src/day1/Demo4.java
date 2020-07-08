package day1;

import java.util.*;

class QuestionItem implements Comparable<QuestionItem>{
    String content;
    int score;
    List<Integer> line = new ArrayList<>();
    List<Character> station = new ArrayList<>();

    public QuestionItem(String content, List<Integer> line, List<Character> station) {
        this.content = content;
        this.line = line;
        this.station = station;
    }

    public int isNeeded(int a){
        if(a == 0){
            return 0;
        }
        else {
            return 1;
        }
    }

    @Override
    public int compareTo(QuestionItem o) {
        int flag = 0;
        if(o.score > this.score){
            flag = 1;
        }
        return flag;
    }
}

public class Demo4 {

    public static void showStatus(){
        System.out.println("[0]完全不符合 " +
                "[1]不太符合 " +
                "[2]略符合 " +
                "[3]符合 " +
                "[4]很符合 " +
                "[5]非常符合 ");
    }

    public static int getChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        choice = scanner.nextInt();
        while(true){
            if(choice <=5 && choice >= 0){
                break;
            }
            else{
                System.out.println("valid choice >>>" + choice);
                choice = scanner.nextInt();
            }
        }
        return choice;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("每一个问题选择六种不同的程度：");

        List<Integer> line1 = new ArrayList<>();
        line1.add(1);
        List<Character> station1 = new ArrayList<>();
        station1.add('J');
        station1.add('C');
        station1.add('A');
        QuestionItem questionItem1 = new QuestionItem("英语单词、理科公式，背了很多，一到关键时刻就掉链子，啥也记不起来。",line1,station1);

        List<Integer> line2 = new ArrayList<>();
        line2.add(4);
        List<Character> station2 = new ArrayList<>();
        station2.add('P');
        station2.add('M');
        station2.add('R');
        QuestionItem questionItem2 = new QuestionItem("拖延症严重，面对眼前的计划，迟迟不肯行动。",line2,station2);

        List<Integer> line3 = new ArrayList<>();
        line3.add(2);
        line3.add(8);
        List<Character> station3 = new ArrayList<>();
        station3.add('O');
        station3.add('F');
        station3.add('T');
        QuestionItem questionItem3 = new QuestionItem("即使认真学习，也有明显的瓶颈，原地踏步，无法进一步提升。",line3,station3);

        List<Integer> line4 = new ArrayList<>();
        line4.add(2);
        List<Character> station4 = new ArrayList<>();
        station4.add('J');
        station4.add('S');
        station4.add('T');
        QuestionItem questionItem4 = new QuestionItem("抓不住概念之间的联系和脉络，感觉知识零零散散不系统。",line4,station4);

        List<Integer> line5 = new ArrayList<>();
        line5.add(2);
        line5.add(6);
        List<Character> station5 = new ArrayList<>();
        station5.add('V');
        station5.add('W');
        station5.add('J');
        QuestionItem questionItem5 = new QuestionItem("课上要讲的内容太多，接受起来非常困难",line5,station5);

        List<Integer> line6 = new ArrayList<>();
        line6.add(2);
        line6.add(5);
        List<Character> station6 = new ArrayList<>();
        station6.add('E');
        station6.add('D');
        station6.add('J');
        station6.add('K');
        QuestionItem questionItem6 = new QuestionItem("孩子反复背诵，怎么也记不住，更不会活学活用",line6,station6);

        List<Integer> line7 = new ArrayList<>();
        line7.add(7);
        line7.add(4);
        List<Character> station7 = new ArrayList<>();
        station7.add('R');
        station7.add('P');
        station7.add('N');
        QuestionItem questionItem7 = new QuestionItem("给孩子讲多少遍努力都没用，不用功、不努力、就是玩",line7,station7);

        List<Integer> line8 = new ArrayList<>();
        line8.add(1);
        List<Character> station8 = new ArrayList<>();
        station8.add('J');
        station8.add('C');
        station8.add('A');
        QuestionItem questionItem8 = new QuestionItem("孩子只会套用公式，题目稍稍改变就不会做了",line8,station8);

        List<Integer> line9 = new ArrayList<>();
        line9.add(1);
        List<Character> station9 = new ArrayList<>();
        station9.add('J');
        station9.add('C');
        station9.add('A');
        QuestionItem questionItem9 = new QuestionItem("孩子学得一知半解，遇到题目总会出现概念混淆的情况",line9,station9);

        System.out.println(questionItem1.content);
        showStatus();
        questionItem1.score = getChoice();
        System.out.println(questionItem2.content);
        showStatus();
        questionItem2.score = getChoice();
        System.out.println(questionItem3.content);
        showStatus();
        questionItem3.score = getChoice();
        System.out.println(questionItem4.content);
        showStatus();
        questionItem4.score = getChoice();
        System.out.println(questionItem5.content);
        showStatus();
        questionItem5.score = getChoice();
        System.out.println(questionItem6.content);
        showStatus();
        questionItem6.score = getChoice();
        System.out.println(questionItem7.content);
        showStatus();
        questionItem7.score = getChoice();
        System.out.println(questionItem8.content);
        showStatus();
        questionItem8.score = getChoice();
        System.out.println(questionItem9.content);
        showStatus();
        questionItem9.score = getChoice();

        QuestionItem[] userQuestions = new QuestionItem[9];

        userQuestions[0] = questionItem1;
        userQuestions[1] = questionItem2;
        userQuestions[2] = questionItem3;
        userQuestions[3] = questionItem4;
        userQuestions[4] = questionItem5;
        userQuestions[5] = questionItem6;
        userQuestions[6] = questionItem7;
        userQuestions[7] = questionItem8;
        userQuestions[8] = questionItem9;



        for (int i = 0; i < userQuestions.length; i++) {
            for (int j = 0; j < userQuestions.length-1-i; j++) {
                if(userQuestions[j].score < userQuestions[j+1].score){
                    QuestionItem temp = userQuestions[j];
                    userQuestions[j] = userQuestions[j+1];
                    userQuestions[j+1] = temp;
                }
            }
        }

        int counter = 0;

        for (int i = 0; i < userQuestions.length; i++) {
            counter += userQuestions[i].score;

        }

        List<Integer> resultOfLine = new ArrayList();
        for (int i = 0; i < userQuestions.length; i++) {
            if(userQuestions[i].score > 0){
                resultOfLine.addAll(userQuestions[i].line);
            }
        }

        List<Character> resultOfStation = new ArrayList() ;
        for (int i = 0; i < userQuestions.length; i++) {
            if(userQuestions[i].score > 0){
                resultOfStation.addAll(userQuestions[i].station);
            }
        }

        System.out.println("总分：");
        System.out.println(counter);
        System.out.println("路线方案：");
        System.out.println(resultOfLine);
        System.out.println("站点方案：");
        System.out.println(resultOfStation);
    }




}
