class Student{
  String name;
  int id;
  String addr;
  //setters
  public void setName(String name){
    this.name=name;
  }
  public void setId(int id){
    this.id=id;
  }
  public void setAddr(String addr){
    this.addr=addr;
  }
  //getters
  public String getName(){
    return name;
  }
   public int getId(){
     return id;
   }
  public String getAddr(){
    return addr;
  }
}
public class SetterGetter{
  public static void main(String args[]){
    Student p1=new Student();
    p1.setName("swetha");
    p1.setId(1);
    p1.setAddr("Hyderabad");
    System.out.println("The details are:");
    System.out.println("name:"+p1.getName());
    System.out.println("id:"+p1.getId());
    System.out.println("address:"+p1.getAddr());
  }
}

 