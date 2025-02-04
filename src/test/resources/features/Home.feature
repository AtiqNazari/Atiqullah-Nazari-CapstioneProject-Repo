Feature: Retail Home Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'King123@gmail.com' and password 'Virginia@32'
    And User click on login button
    And User should be logged in into Account

  @Test001 #Passed
  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @Test002 #Passed
  Scenario Outline: Verify department sidebar options
    When User click on All section
    And User on "<department>"
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |

  @Test003 #Passed
  Scenario: Verify User can add an item to cart
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @Test004 #passed
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country       | fullName | phoneNumber  | streetAddress | apt | city      | state | zipCode |
      | United States | jimiAfg  | 854 256 3205 | 1216 book ave |  12 | charlotte | Utah  |   65821 |
    And User click Add Your Address buttn
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card information
      | cardNumber            | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1478883688526600      | Jason      | 11              | 2027           | 855          |
    And User click on Add your card button
    And User click on Place Your Order
   Then a message should be displayed ‘Order Placed Successfully’

  @Test005 #Passed
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    And User changed the category to 'Electronics'
    And User search for an item 'Apex Legends'
    And User clicked on Search icon
    And User click on an item
    And User selected quantity '5'
    Then the carts icon quantity should change to '5'
    And User clicked add to Cart button
    And User clicked on Cart option 
    And User clicked on Proceed to Checkout button
    And User clicked on Place Your Order
    Then a message should be displayed ‘Order Placed Successfully’
