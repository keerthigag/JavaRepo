package org.test;


public class Fillo{
	
Fillo fillo=new Fillo();

Connection connection=fillo.getConnection("D:/Study/Test.xlsx");
String strQuery="Select * from Sheet1 where name='Myself'";
Recordset recordset=connection.executeQuery(strQuery);
 
while(recordset.next()){
System.out.println(recordset.getField("Details"));
}     
recordset.close();
connection.close();
}
}

