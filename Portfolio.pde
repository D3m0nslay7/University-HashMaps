import java.util.Scanner;

Scanner reader;

PhoneList phoneList = new PhoneList();
PhoneMap phoneMap = new PhoneMap();


void setup() {
  size(600, 600);

  reader = InputReader.getScanner("C://UniversityWork//Unit 1 - Object Oriented programming (OOP)//Portfolio//Exercise 9//Portfolio//data.csv");
  reader.nextLine();

  while (reader.hasNext()) {

    String header[] = reader.nextLine().split(",");

    Phone phone = new Phone(header[0]);

    phone.setModel(header[1]);
    phone.setAnnounced(header[8]);
    phone.setWeight_g(float(header[11]));
    phone.setInternal_memory(header[21]);
    phone.setApprox_price_EUR(int(header[36]));

    phoneList.AddPhone(phone);
    phoneMap.AddPhone(phone);
  }

  phoneList.sort();

  //for(Phone test : phoneList.phones){
  //println(test.toString());
  //}
  //phoneList.GetCostOver(600);
  //println(phoneMap.GetSize());
  //phoneMap.PrintPhoneMap();

  //phoneMap.GetCostOver(700);

  println(phoneMap.FindPhone("Apple", "iPhone 7 Plus"));

  println(phoneList.FindPhone("Huawei", "Mate 9 Porsche Design"));
}


void draw() {
}
