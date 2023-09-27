import java.util.HashMap;

class PhoneMap {

  HashMap<String, Phone> phoneMap;

  public PhoneMap() {
    phoneMap = new HashMap<String, Phone>();
  }

  public void AddPhone(Phone p) {
    String k = p.getBrand() + p.getModel();
    phoneMap.put(k, p);
  }

  public int GetSize() {
    return phoneMap.size();
  }

  public void PrintPhoneMap() {
    for (String k : phoneMap.keySet()) {
      Phone item = phoneMap.get(k); // process
      System.out.println(item);
    }
  }

  public void GetCostOver(int price) {

    for (String k : phoneMap.keySet()) {
      Phone data = phoneMap.get(k); // process
      if (data.getApprox_price_EUR() > price) {
        System.out.println(data);
      }
    }
  }

  public Phone FindPhone(String BrandName, String ModelName) {
    for (String k : phoneMap.keySet()) {
      Phone data = phoneMap.get(k); // process
      if (data.getBrand().toUpperCase().equals(BrandName.toUpperCase()) && data.getModel().toUpperCase().equals(ModelName.toUpperCase())) {

        return data;
      }
    }

    return null;
  }
}
