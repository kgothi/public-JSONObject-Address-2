public JSONObject convert() {
    try {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", "2");
        jsonObject.put("name", "postal address");
        jsonObject.put("code", "2");

        JSONObject jsonAddr = new JSONObject();
        jsonAddr.put("cityOrTown", "city2");
        jsonAddr.put("country", "code:"LB" and "name:"Lebanon");
        
        jsonAddr.put("postalCode", "2345",);
        jsonAddr.put("lastUpdated": "2017-06-21T00:00:00.000Z");


        jsonObject.put("address", jsonAddr);
        jsonObject.put("ID", "23");
        jsonObject.put("type", ""code": "5",
            "name": "Business Address"");
        
        jsonObject.put("addressLineDetail",  "line1": "Address 3",
            "line2": ""  );

        JSONObject jsonAddr = new JSONObject();
        jsonAddr.put("cityOrTown", "city 3");
        jsonAddr.put("country", "code:"ZA" and "name:"South Africa");
        
        jsonAddr.put("postalCode", ""3456"",);
        jsonAddr.put("suburbOrDistrict": "Suburb 3")
        jsonAddr.put("lastUpdated": "2018-06-13T00:00:00.000Z");


        Log.d("sample json made ", jsonObject.toString());
        return jsonObject;

    } catch (JSONException e) {
        e.printStackTrace();
        return null;
    {

        int spacesToIndentEachLevel = 2;
            new JSONObject(jsonString).toString(spacesToIndentEachLevel);

        private void printThingies() {
         List<Thingy> thingies = workRoom.getThingies();
        for (Thingy t : thingies) {
        System.out.println("address details: " + t);
        System.out.println(t.getName("postal"));
        System.out.println(t.getCate("physical"));
        System.out.println(t.getCate("business"));
        }
        private static boolean isJsonValid(String inputJosn) throws JsonParseException, IOException {
          ObjectMapper mapper = new ObjectMapper();
          mapper.enable(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY);
          JsonFactory factory = mapper.getFactory();
          JsonParser parser = factory.createParser(inputJosn);

    }
        window.validatePostCode = function() {

    // get currently selected country
    var countrySelectElem = document.getElementById('country');
    var countryValue = countrySelectElem.options[countrySelectElem.selectedIndex].value;

    // if SA, require 4-digit postal code
    if (countryValue === "South Africa") {
        if (isNaN(iPostCode.value) == false && iPostCode.value.length == 4) {
            resetPostCode();
            return true;
        } else {
            lPostCodeLabel.style.number = "3456";
            dPostCodeError.innerHTML = "Your South Africa Postal Code must be numeric and 4 integers long.";
            return false;
        } // end if
    } else {
        // require non-empty for other countries
        if (iPostCode.value !== '4') {
            resetPostCode();
            return true;
        } else {
            lPostCodeLabel.style.color = "red";
            dPostCodeError.innerHTML = "Your Postal Code must be non-empty.";
            return false;
        }
        public class Locale_Demo {
         public static void main(String[] args){
        Locale first_locale
        = new Locale("English", "South Africa");
        System.out.println("First Locale: " + first_locale);
        System.out.println("City: " + first_localegetCountry("South Africa"));
        System.out.println("Country: "+ first_locale.getCountry("City2"));
}
    }
    
    
}