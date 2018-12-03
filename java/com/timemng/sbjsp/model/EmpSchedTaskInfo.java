package com.timemng.sbjsp.model;

public class EmpSchedTaskInfo {
	/* 
    private Long id;
    private String fullName;
    private double balance;
 
    public BankAccountInfo(Long id, String fullName, double balance) {
        super();
        this.id = id;
        this.fullName = fullName;
        this.balance = balance;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getFullName() {
        return fullName;
    }
 
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
 
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
    */
	
	private Long taskId;
    private String taskName;
   
 
    public EmpSchedTaskInfo(Long taskId, String taskName) {
        super();
        this.taskId = taskId;
        this.taskName = taskName;
        // this.balance = balance;
    }
 
    public Long getTaskId() {
        return taskId;
    }
 
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
 
    public String getTaskName() {
        return taskName;
    }
 
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}