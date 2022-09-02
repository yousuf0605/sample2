Feature: Verify the Adactin longin page

  Scenario Outline: Verfiying the Adactin login page with valid credential
    Given User on the Adactin login page
    When User should enter login details "<username>","<password>"
    And User should search for hotel "<location>","<hotel>","<roomtype>","<noofrooms>","<checkindate>","<checkoutdate>","<adultrooms>","<childrooms>"
    And User should click the radio button
    And user should enter the details "<firstname>","<lastname>","<billingaddress>","<creditcardno>","<creditcardtype>","<expirymonth>","<expiryyear>","<cvvnumber>"
    And user prints the order id in console
    Then Verify the sucess login message

    Examples: 
      | username   | password | location | hotel       | roomtype | noofrooms | checkindate | checkoutdate | adultrooms | childrooms | firstname | lastname | billingaddress | creditcardno     | creditcardtype | expirymonth | expiryyear | cvvnumber |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Yousuf    | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Ravi      | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Vicki     | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Aishu     | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Renuka    | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Sindya    | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Nithya    | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Krish     | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Kavi      | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Surya     | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Naveen    | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
      | Greens8767 | QN8V3A   | Sydney   | Hotel Creek | Standard | 1 - One   | 18/08/2022  | 19/08/2022   | 1 - One    | 0 - None   | Rahul     | H        | chennai        | 1234567890123450 | VISA           | January     |       2022 |       236 |
