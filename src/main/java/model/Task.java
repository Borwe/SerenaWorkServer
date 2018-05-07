package model;

import java.io.Serializable;

public class Task implements Serializable{
    private long task_id;
    private String task_date;
    private String task_text;
    private boolean task_sent;

    public Task(String task_date,String task_text){
        this.task_date=task_date;
        this.task_text=task_text;
        this.task_sent=false;
    }

    public long getTask_id() {
        return task_id;
    }

    public void setTask_id(long task_id) {
        this.task_id = task_id;
    }

    public String getTask_date() {
        return task_date;
    }

    public void setTask_date(String task_date) {
        this.task_date = task_date;
    }

    public String getTask_text() {
        return task_text;
    }

    public void setTask_text(String task_text) {
        this.task_text = task_text;
    }

    public boolean isTask_sent() {
        return task_sent;
    }

    public void setTask_sent(boolean task_sent) {
        this.task_sent = task_sent;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_id='" + task_id + '\'' +
                ", task_date='" + task_date + '\'' +
                ", task_text='" + task_text + '\'' +
                ", task_sent=" + task_sent +
                '}';
    }
}
