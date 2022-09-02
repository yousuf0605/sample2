Feature: verifying facebook login with multiple datas

  Scenario: Enter the username and password
    Given User logins to facebook
    When User is enters username and passowrd
    
      | username | password  |
      | yousuf   | irfan007  |
      | irfan    | yousuf007 |
      | aishu    | aishu@123 |
