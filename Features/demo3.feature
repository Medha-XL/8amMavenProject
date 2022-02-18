Feature: Calculator
  
  @TestCase1
  Scenario: Addition of two numbers
    Given Read <a> and <b> 
    When Calculate a+b
    Then Display the <result>
    
  Examples: 
      | a   | b   | result |
      | 100 | 120 |  220   |
      | 50  | 120 |  170   |
      | 70  | 120 |  190   |
      | 100 | 100 |  200   |
      
  @TestCase2
  Scenario: multiplication of two numbers
    Given Read <a> and <b> 
    When Calculate a*b
    Then Display the <result> 

     Examples: 
      | a     | b    | result |
      | 10    | 10   |  100   |
      | 20    | 30   |  600   |
      