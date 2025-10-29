package by.lessons.task11;

public class Table <T1 extends Integer, T2 extends Person>{
 private T1 inventaryNumber;
 private T2 personAtTable;

 public Table(T1 inventaryNumber, T2 personAtTable) {
  this.inventaryNumber = inventaryNumber;
  this.personAtTable = personAtTable;
 }
 public Table() {

 }
}
