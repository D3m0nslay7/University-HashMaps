import java.util.ArrayList;
import java.util.Collections;

class PhoneList {

  ArrayList<Phone> phones;

  public PhoneList() {
    phones = new ArrayList<Phone>();
  }


  public void AddPhone(Phone p) {
    phones.add(p);
  }

  public int GetSize() {
    return phones.size();
  }

  public void sort() {
    Collections.sort(phones);
  }

  public void GetCostOver(int price) {

    for (Phone data : phones) {
      if (data.getApprox_price_EUR() > price) {
        System.out.println(data);
      }
    }
  }

  public Phone FindPhone(String BrandName, String ModelName) {
    Phone p = null;

    for (Phone data : phones) {

      if (data.getBrand().toUpperCase().equals(BrandName.toUpperCase()) && data.getModel().toUpperCase().equals(ModelName.toUpperCase())) {

        return data;
      }
    }

    return p;
  }
}
