class Employee
{
String Name
Integer Age
Integer Salary
String toString()
{
"$Name $Age $Salary"
}
}
def l = [new Employee(Name:"Nitin",Age:21,Salary:20000),new Employee(Name:"Sakshi",Age:21,Salary:2000),new Employee(Name:"Abhinav",Age:20,Salary:2500),new Employee(Name:"Shalin",Age:21,Salary:4000),new Employee(Name:"Saurabh",Age:23,Salary:9000),new Employee(Name:"Rishabh",Age:25,Salary:7000),new Employee(Name:"Kshitij",Age:23,Salary:10000),new Employee(Name:"Akash",Age:19,Salary:200)]
println l
println l.findAll{it.Salary>5000}
Employee oldest =l.max{it.Age}
Employee youngest = l.min{it.Age}
println oldest.Name
println youngest.Name
println l.max{it.Salary}