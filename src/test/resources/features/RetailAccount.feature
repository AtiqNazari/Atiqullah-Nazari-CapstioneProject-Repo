Feature: Retail Account page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'King123@gmail.com' and password 'Virginia@32'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option
   
  @Test11 #passed
  Scenario: Verify User can update Profile Information
    And User update Name 'Jason Ramerio' and Phone '980 222 1178'
    And User click on Update button
    Then user profile information should be updated
    

  @Test22 #Passed
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword   | confirmPassword |
      | Virginia@432123   | Virginia@32 | Virginia@32  |
    And User click on Change Password button
   Then a message should be displayed ‘Password Updated Successfully’
   
   
  @Test33 #passed
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User is fill Debit or credit card information
      | cardNumber          | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1595547825824444 | thomasJohn |              12 |            2025 |          879 |
    And User is click on Add your card button
   Then a message should be displayed ‘Payment Method added sucessfully’
   
   
  @Test44 #Passed
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User select the card with ending '2323'
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 8545651455852244 | AliKhann    |              12 |           2025 |           555 |
    And user click on Update Your Card button
   Then a Message should be displayed 'Payment Method updated Successfully'

  @Test55 #passed
  Scenario: Verify User can remove Debit or Credit card
  And User select the card with ending '2323'
    And User click on remove option of card section
    Then payment details should be removed

  @Test66 #passed
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill address form with below information
      | country | fullName    | phoneNumber | streetAddress | apt | city     | state    | zipCode |
      | United States | Alex kabiri |  5874325646 | 254 greeg ave | 255 | Sterling | Virginia |   54864 |
    And User click Add Your Address button

    Then a message should be displayed 'Address Added Successfully'
  
  @Test77 #passed
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country      | fullName   | phoneNumber | streetAddress   | apt | city      | state          | zipCode |
      | United States| Mohamad ali| 875 525 5214| 1415 greeg point| 122 | Charlotte | North Carolina | 25461   |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @Test88 #passed
  Scenario: Verify User can remove Address from Account
  
    And User click on remove option of Address section
    Then Address details should be removed
