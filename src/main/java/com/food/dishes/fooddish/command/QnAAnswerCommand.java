package com.food.dishes.fooddish.command;

public class QnAAnswerCommand {

    private String content;

    public QnAAnswerCommand() {}

    public QnAAnswerCommand(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
