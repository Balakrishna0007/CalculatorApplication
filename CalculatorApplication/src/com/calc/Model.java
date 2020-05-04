package com.calc;

public class Model 
{
	private Integer firstNumber;
	private Integer secondNumber;
	private Integer result;
	private String operation;
	
	
	public Integer getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(Integer firstNumber) {
		this.firstNumber = firstNumber;
	}
	public Integer getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(Integer secondNumber) {
		this.secondNumber = secondNumber;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	@Override
	public String toString() {
		return "Model [firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + ", result=" + result
				+ ", operation=" + operation + "]";
	}
	
	
	
}
